package com.lt.crs.dto;

import com.lt.crs.bean.Course;
import com.lt.crs.bean.Professor;
import com.lt.crs.bean.Student;
import com.lt.crs.bean.StudentGrade;


/**
 * @author SHITAL
 *
 */
public class StudentCourseDetails {
	
	private Student student;
	private Course course;
	private Professor professor;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public StudentGrade getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(StudentGrade studentGrade) {
		this.studentGrade = studentGrade;
	}
	private StudentGrade studentGrade;

}
