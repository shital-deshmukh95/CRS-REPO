package com.lt.crs.dao;


public interface LoginUserDAOInterface {
public void userLogin(String userId,String userPassword) throws  Exception;

public void updatePassword(String userID, String oldpw, String newpw) throws Exception;
}