package com.lt.crs.business;


import com.lt.crs.dao.StudentDAOImpl;
import com.lt.crs.dao.StudentDAOInterface;


/**
 * 
 * @author SHITAL
 * This Class is related all the Student Operation
 *
 */
public class StudentOperation implements StudentInterface {

	StudentDAOInterface stud = null;
	
	/**
	 * is used to add course for the student
	 * @param studentId
	 */
	@Override
	public void addCourse(int studentId) {
		stud = new StudentDAOImpl();
		try {
			stud.addCourse(studentId);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * drop course method 
	 * @param student id
	 */
	@Override
	public void dropCourse(int studentId) {
		stud = new StudentDAOImpl();
		try {
			stud.dropCourse(studentId);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	/**
	 * this method displays the students who are all enrolled for the course
	 * @param studentId
	 */
	@Override
	public void viewEnrolledCourse(int studentId) {
		stud = new StudentDAOImpl();
		try {
			stud.viewEnrolledCourses(studentId);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/**
	 * using this method student can view the report card
	 * @param studentId
	 */
	@Override
	public void viewReportCard(int studentId) {
		stud = new StudentDAOImpl();
		try {
			stud.viewReportCard(studentId);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
