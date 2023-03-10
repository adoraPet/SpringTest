package io.adorapet.test.database.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.adorapet.test.database.dao.StoreDAO;
import io.adorapet.test.database.model.Store;

@Service
public class StoreBO {
	
	@Autowired
	private StoreDAO storeDAO;
	
	public List<Store> getStoreList() {
		
		List<Store> storeList = storeDAO.selectStoreList();
		
		return storeList;
	}



}
