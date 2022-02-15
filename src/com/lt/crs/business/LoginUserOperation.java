package com.lt.crs.business;


import com.lt.crs.dao.LoginUserDAOImpl;

/**
 * 
 * @author SHITAL
 * 
 */
public class LoginUserOperation implements LoginUserInterface {
	com.lt.crs.dao.LoginUserDAOInterface user = null;
	
	/**
	 * 
	 * 
	 * @param userId
	 *            is User Id
	 * @param userPassword
	 *            user login method
	 */

	public void userLogin(String userId, String userPassword) {
		user = new LoginUserDAOImpl();
		try {
			user.userLogin(userId, userPassword);
		}  catch (Exception e) {
			System.out.println(e);
		}

	}
	/**
	 * 
	 * @param userID
	 * @param oldpw is Old password
	 * @param newpw is new Password
	 * this is used to update password
	 */
	@Override
	public void updatePassword(String userID, String oldpw, String newpw) {
		user = new LoginUserDAOImpl();
		try {
			user.updatePassword(userID, oldpw, newpw);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
