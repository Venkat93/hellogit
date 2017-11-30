package com.map.hashmap.examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1101,"Balaram","Male");
		Employee e2=new Employee(1102,"Mahesh","Male");
		Employee e3=new Employee(1103,"Akhil","Male");
		Employee e4=new Employee(1104,"Anuroop","Male");
		Employee e5=new Employee(1105,"shahi","Female");
		Employee e6=new Employee(1106,"sakshi","Female");
		Employee e7=new Employee(1107,"Harsha","Male");
		Employee e8=new Employee(1103,"Akhil","Male");
		
		Address adrs1=new Address(4120, "WoodLand Plaza", "IOWA", 50266);
		Address adrs2=new Address(4101,"Pamela","IOWA",50266);
		Address adrs3=new Address(4021,"Eastcost","IOWA",50266);
		Address adrs4=new Address(7608,"Garnett","Kansas",66214);
		Address adrs5=new Address(11708,"76th ter", "Kansas", 66214);
		
		Map<Employee,List<Address>> map=new HashMap<Employee,List<Address>>();
		
		List<Address> list1=new ArrayList<Address>();
		list1.add(adrs1);
		list1.add(adrs4);
		list1.add(adrs5);
		
		List<Address> list2=new ArrayList<Address>();
		list2.add(adrs2);
		list2.add(adrs3);
		list2.add(adrs5);
		
		
		
		
		map.put(e1,list1);
		map.put(e2, list2);
		
		map.put(e3, list1);
		map.put(e4, list1);
		map.put(e5, list2);
		
		
		
		Set<Employee> set=map.keySet();
		for(Employee s:set) {
			List<Address> adrs=map.get(s);
			System.out.print(s);
			for(Address adr:adrs) {
				System.out.println(adr);
			}
		}
		
		

	}

}
