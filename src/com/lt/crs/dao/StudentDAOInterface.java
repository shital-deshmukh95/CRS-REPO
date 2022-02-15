package com.lt.crs.dao;
/**
 * 
 * @author SHITAL
 *
 */
public interface StudentDAOInterface {
/**
 * 
 * @param studentId
 * @throws Exception
 */
	public void addCourse(int studentId) throws Exception;
	/**
	 * 
	 * @param studentId
	 * @throws Exception
	 */

	public void dropCourse(int studentId) throws Exception;
	/**
	 * 
	 * @param studentId
	 * @throws Exception
	 */

	public void viewEnrolledCourses(int studentId) throws Exception;
	/**
	 * 
	 * @param studentId
	 * @throws Exception
	 */
	public void viewReportCard(int studentId) throws Exception;

}
