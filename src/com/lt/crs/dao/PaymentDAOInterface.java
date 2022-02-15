package com.lt.crs.dao;



/**
 * @author SHITAL
 */
public interface PaymentDAOInterface {
	
	/**
	 * 
	 * @param userId
	 * @param courseId
	 */
	void makePayment(int userId,int courseId) throws Exception ;

}
