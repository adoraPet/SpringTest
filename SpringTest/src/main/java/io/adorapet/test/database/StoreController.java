package io.adorapet.test.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.adorapet.test.database.bo.StoreBO;
import io.adorapet.test.database.model.Store;

@Controller
public class StoreController {
	
	@Autowired
	private StoreBO storeBO;
	
	@RequestMapping("/database/test01")
	@ResponseBody
	public List<Store> storeList() {
		
		List<Store> storeList = storeBO.getStoreList();
		
		return storeList;
		
	}

}