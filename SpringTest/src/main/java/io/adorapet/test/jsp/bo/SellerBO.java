package io.adorapet.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.adorapet.test.jsp.dao.SellerDAO;
import io.adorapet.test.jsp.model.Seller;

@Service
public class SellerBO {
	
	@Autowired
	private SellerDAO sellerDAO;
	
	public int addSeller(String nickname, String profileUrl, double temperature) {
		return sellerDAO.insertSeller(nickname, profileUrl, temperature);
		
	}
	
	public Seller getLastSeller() {
		return sellerDAO.selectLastSeller();
	}
	
	public Seller getSeller(int id) {
		return sellerDAO.selectSeller(id);
	}

}
