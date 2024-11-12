package com.tns.ifet.day5;

public class HierarchicalInhDem {

	public static void main(String[] args) {
		Person1 p1 = new Person1();
		System.out.println("----------------- Person Details ---------------------");
		System.out.println(p1);

		Person1 p;
		p = new Person1("Dhruv", "Mumbai");
		if (p instanceof Person1)
			System.out.println("Person Details "+p);
		
		p = new Employee1("Nikhil", "Mumbai", 101, 67000, "Sales");
		if (p instanceof Employee1)
		System.out.println("Employee Details "+p);
		

		p = new Student1("Pankaj", "Pune", "FE", 88);
		if (p instanceof Student1)
			System.out.println("Student Details "+p);

	}

}
