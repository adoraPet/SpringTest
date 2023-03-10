package io.adorapet.test.jsp.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.adorapet.test.jsp.dao.RealtorDAO;
import io.adorapet.test.jsp.model.Realtor;

@Service
public class RealtorBO {
	
	@Autowired
	private RealtorDAO realtorDAO;
	
	public int addRealtor(
			String office
			, String phoneNumber
			, String address
			, String grade) {
	
		return realtorDAO.insertRealtor(
				office
				, phoneNumber
				, address
				, grade);
	}	
	
	public int addRealtorByObject(Realtor realtor) {
		return realtorDAO.insertRealtorByObject(realtor);
	}
	


}
