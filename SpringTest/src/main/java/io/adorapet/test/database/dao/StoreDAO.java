package io.adorapet.test.database.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.adorapet.test.database.model.Store;

@Repository
public interface StoreDAO {
	
	public List<Store> selectStoreList();


}
