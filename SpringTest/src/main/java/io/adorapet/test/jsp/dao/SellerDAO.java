package io.adorapet.test.jsp.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import io.adorapet.test.jsp.model.Seller;

@Repository
public interface SellerDAO {
	
	public int insertSeller(
			@Param("nickname") String nickname
			, @Param("profileUrl") String profileUrl
			, @Param("temperature") double temperature);

	public Seller selectLastSeller();
	
	public Seller selectSeller(@Param("id") int id);
}
