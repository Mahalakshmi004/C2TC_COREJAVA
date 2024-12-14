package com.maha.assignment.utilities;
import com.maha.assignment.employees.Employee;
import com.maha.assignment.employees.Manager;
import com.maha.assignment.employees.Developer;
public class EmployeeUtilities {
	 public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        System.out.println("Salary: " + employee.getSalary());
	    }
	 public static void printmangerDetails(Manager manage) {
	        System.out.println("Department " + manage.getDepartment());
	    }
	 public static void printdeveloperDetails(Developer develop) {
	        System.out.println("Programming Language: " + develop.getProgrammingLanguage());
	    }
	 
}
