package com.gl.javafsd.department.assignment;

/**
 * Super class for all Departments
 * 
 * @author MANJALI SHARMA
 *
 */

public class SuperDepartment {
	
	public SuperDepartment () {
		System.out.print(" Welcome to ");
	}
	
	/**
	 * Returns the Department Name
	 */
	public String departmentName () {
		return " Super Department ";
	}
	
	/**
	 * Returns the Today's work
	 */
	public String getTodaysWork () {
		return " No Work as of Now ";
	}
	
	/**
	 * Returns work Deadline
	 */
	public String getWorkDeadline () {
		return " Nil ";
	}
	
	/**
	 * Returns Holiday detail
	 */
	public String isTodayAHoliday () {
		return " Today is not a Holiday ";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
