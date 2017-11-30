package com.linkedlist.examples;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Employee> list=new LinkedList<Employee>();
		list.add(new Employee(101,"Bharath","Male",50));
		list.add(new Employee(102,"Ramu","Male",48));
		list.add(new Employee(103,"venky","Mal",55));
		list.set(1, new Employee(104,"Ravi","Male",65));
		list.add(0, new Employee(100,"Rami Reddy","Male",55));
		list.add(new Employee(106,"Venkat","Male",52));
		
		for(Employee print:list) {
			System.out.println(print);
		}

	}

}
