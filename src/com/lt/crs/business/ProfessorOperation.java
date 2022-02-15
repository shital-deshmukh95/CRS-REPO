package com.lt.crs.business;


import com.lt.crs.dao.ProfessorDAOImpl;
import com.lt.crs.dao.ProfessorDAOInterface;

/**
 * 
 * @author SHITAL
 * 
 */
public class ProfessorOperation implements ProfessorInterface {

	ProfessorDAOInterface prd = null;
	
	/**
	 * is used to view the student by entering the student id
	 */
	@Override
	public void viewStudent(int profId) {
		prd = new ProfessorDAOImpl();
		try {
			prd.viewStudent(profId);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	
	/**
	 * this method is used to add grade for the student by the professor
	 * 
	 * @param profId
	 */
	@Override
	public void addGrade(int profId) {
		prd = new ProfessorDAOImpl();
		try {
			prd.addGrade(profId);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
