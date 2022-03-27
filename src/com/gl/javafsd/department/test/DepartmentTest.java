package com.gl.javafsd.department.test;

import com.gl.javafsd.department.assignment.AdminDepartment;
import com.gl.javafsd.department.assignment.HRDepartment;
import com.gl.javafsd.department.assignment.SuperDepartment;
import com.gl.javafsd.department.assignment.TechDepartment;

/**
 * Creates instances of required Department and call required methods to produce expected result.
 * @author MANJALI SHARMA
 *
 */

public class DepartmentTest {

	public static void main(String[] args) {
		SuperDepartment adminDept = new AdminDepartment();
		System.out.println(adminDept.departmentName());
		System.out.println(adminDept.getTodaysWork());
		System.out.println(adminDept.getWorkDeadline());
		System.out.println(adminDept.isTodayAHoliday());
		System.out.println("");
		
		HRDepartment hrDept = new HRDepartment ();
		System.out.println(hrDept.departmentName());
		System.out.println(hrDept.doActivity());
		System.out.println(hrDept.getTodaysWork());
		System.out.println(hrDept.getWorkDeadline());
		System.out.println(hrDept.isTodayAHoliday());
		System.out.println("");
		
		TechDepartment techDept = new TechDepartment();
		System.out.println(techDept.departmentName());
		System.out.println(techDept.getTodaysWork());
		System.out.println(techDept.getWorkDeadline());
		System.out.println(" " + techDept.getTechStackInformation());
		System.out.println(techDept.isTodayAHoliday());
		
		

	}

}
