package com.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

class Student implements Comparable<Student>{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	/*@Override
	public int compareTo(Student o) {
		//return this.name.compareTo(o.name);
		if (this.age == o.age)
			return 0;
		else if (this.age>o.age)
		return 1;
		else 
			return -1;
		
		
	}*/
	@Override
	public int compareTo(Student o) {
		if(this.id == o.id) 
			return 0;
		else if(this.id > o.id)
		return 1;
		else
			return -1;
		
	}
}

public class Sorting {
	
	public static void main(String args[]) {

	ArrayList<Student> al = new ArrayList<Student>();
	
	al.add(new Student(1,"Tintu",36));
	al.add(new Student(2,"Jinto",40));
	al.add(new Student(3,"Juan",8));
	al.add(new Student(4,"Jonath",3));
	
	
	
	  al.forEach(s->{System.out.println(s);});
	  Collections.sort(al);
	  System.out.println(); 
	  al.forEach(s->System.out.println(s));
	 
	
	
	
	
	}
}
