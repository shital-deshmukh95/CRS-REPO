package com.lt.crs.business;
/**
 * @author SHITAL
 */

public interface LoginUserInterface {
	/**
	 * 
	 * @param userId is User Id
	 * @param userPassword
	 * user login method 
	 */
public void userLogin(String userId,String userPassword) ;

/**
 * 
 * @param userID
 * @param oldpw is Old password
 * @param newpw is new Password
 * this is used to update password
 */

public void updatePassword(String userID, String oldpw, String newpw);
}
