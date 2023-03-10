package io.adorapet.test.mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import org.springframework.stereotype.Repository;

import io.adorapet.test.mybatis.model.RealEstate;

@Repository
public interface RealEstateDAO {
	
public RealEstate selectRealEstate(@Param("id") int id);
	
	public List<RealEstate> selectRealEstateListByRentPrice(@Param("rentPrice") int rentPrice);
	
	public List<RealEstate> selectRealEstateListByAreaPrice(
			@Param("area") int area
			, @Param("price") int price);
	
	public int insertRealEstateByObject(RealEstate realEstate);
	
	public int insertRealEstate(
			@Param("realtorId") int realtorId
			, @Param("address") String address
			, @Param("area") int area
			, @Param("type") String type
			, @Param("price") int price
			, @Param("rentPrice") int rentPrice);
	
	// id와 타입 가격을 전달 받고, update 쿼리를 수행한다. 
	public int updateRealEstate(
			@Param("id") int id
			, @Param("type") String type
			, @Param("price") int price);
	
	
	public int deleteRealEstate(@Param("id") int id);

}
