package com.lt.crs.business;

import com.lt.crs.dao.AdminDAOInterface;


import com.lt.crs.dao.AdminDAOImpl;


/**
 * 
 * @author SHITAL
 * 
 */
public class AdminOperation implements AdminInterface {
	AdminDAOInterface admin = null;

	/**
	 * this is used to add professor
	 * 
	 * @param
	 */
	@Override
	public void addProfessor() {
		admin = new AdminDAOImpl();
		try {
			admin.addProfessor();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	/**
	 * Remove professor method
	 */
	@Override
	public void removeProfessor() {
		admin = new AdminDAOImpl();
		try {
			admin.removeProfessor();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * this is used to add student method
	 */
	@Override
	public void addStudent() {
		admin = new AdminDAOImpl();
		try {
			admin.addStudent();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * this method is used to remove student
	 */
	@Override
	public void removeStudent() {
		admin = new AdminDAOImpl();
		try {
			admin.removeStudent();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * This add course method connects to dao class and adds the new course into
	 * the course table
	 */
	@Override
	public void addCourse() {
		admin = new AdminDAOImpl();
		try {
			admin.addCourse();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	
	/**
	 * Remove course method connects with the admin Dao Impl class and Removes
	 * the Course from the course table by the admin
	 */
	@Override
	public void removeCourse() {
		admin = new AdminDAOImpl();
		try {
			admin.removeCourse();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	/**
	 * This methods is responsible for creating report card for students
	 */
	@Override
	public void reportCardGeneration() {
		admin = new AdminDAOImpl();
		try {
			admin.reportCardGeneration();
		} catch (Exception e) {

			System.out.println(e);
		}

	}

}
