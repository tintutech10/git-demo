package com.tutorials;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentList{
	int id;
	String name;
	int age;
	public StudentList(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}

class AgeComparator implements Comparator<StudentList>{


	/*
	 * public int compare(Student o1, Student o2) { if(o1.age == o2.age) return 0;
	 * else if(o1.age>o2.age) return 1; else return -1;
	 * 
	 * }
	 */

	public int compare(StudentList o1, StudentList o2) {
		if(o1.age == o2.age)
			return 0;
		else if(o1.age>o2.age) 
			return 1;
			else
				return -1;
	}
}

class NameComparator implements Comparator<StudentList>{


	/*
	 * public int compare(Student o1, Student o2) { if(o1.age == o2.age) return 0;
	 * else if(o1.age>o2.age) return 1; else return -1;
	 * 
	 * }
	 */

	public int compare(StudentList o1, StudentList o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
public class SortingComprtor {

	public static void main(String[] args) {
		
		List<StudentList> list = new ArrayList<>();
		list.add(new StudentList(100,"Binu",45));
		list.add(new StudentList(101,"Ambu",39));
		list.add(new StudentList(102,"Merin",40));
		
		list.forEach(x->System.out.println(x));
		Collections.sort(list, new NameComparator());
		//Collections.sort(list, new AgeComparator());
		System.out.println();
		list.forEach(x->System.out.println(x));
		

	}

}
