package com.tutorials;

import java.util.List;
import java.util.stream.Collectors;

class Employee{
	Employee(){
		String department;
		
	}
	
}

public class Test10 {

	public static void main(String[] args) {
		
    List<Employee> empList = new ArrayList<>();
    
    empList.stream().filter(e->e.department()).collect(Collectors.toList()).forEach(e->System.out.println(e));
	}

}
