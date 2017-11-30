package com.arrayList.examples;
import java.util.ArrayList;
import java.util.List;

import com.arrayList.examples.Employee;;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1101,"Balaram","Male",5400);
		Employee e2=new Employee(1102,"Mahesh","Male",5500);
		Employee e3=new Employee(1103,"Akhil","Male",5600);
		Employee e4=new Employee(1104,"Anuroop","Male",5700);
		Employee e5=new Employee(1101,"shahi","Female",4800);
		Employee e6=new Employee(1101,"sakshi","Female",5560);
		Employee e7=new Employee(1101,"Harsha","Male",5400);
		Employee e8=new Employee(1101,"nandini","Female",3500);
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		list.add(e8);
		
		list.remove(e6);
		
		System.out.println(list.contains(new Employee(1101,"shahi","Female",4800)));
		
		//By using Java 8 forEach Method and Lambda expressions
		list.forEach(i->System.out.println(i));    
		
		
		//By using enhanced for loop
		/*for(Employee li:list) {
			System.out.println(li);
		}*/
		

	}

}
