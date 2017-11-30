package com.treeSet.comparable.example;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	
	public static void main(String[] args) {
	
	Set<Employee> set=new TreeSet<Employee>();
	Employee e1=new Employee(1101,"Balaram","Male",5400);
	Employee e2=new Employee(1102,"Mahesh","Male",5500);
	Employee e3=new Employee(1103,"Akhil","Male",5600);
	Employee e4=new Employee(1104,"Anuroop","Male",5700);
	Employee e5=new Employee(1105,"shahi","Female",4800);
	Employee e6=new Employee(1106,"sakshi","Female",5560);
	Employee e7=new Employee(1107,"Harsha","Male",5400);
	Employee e8=new Employee(1103,"Akhil","Male",5600);
	
	set.add(e1);  
	set.add(e2);
	set.add(e3);
	set.add(e4);
	set.add(e5);
	set.add(e6);
	set.add(e7);
	set.add(e8);
	
	set.remove(e5);
	
	System.out.println(set.contains(new Employee(1103,"Akhil","Male",5600)));
	
	set.forEach(i->System.out.println(i));
	
	
	}
}
