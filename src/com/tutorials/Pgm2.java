package com.tutorials;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

interface I1{
	 int a=10;
	default void print() {
		System.out.println("print");
	}
	public String show(String msg,int n);
}
public class Pgm2{

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
    // I1 i = new Pgm2();
		/*
		 * System.out.println(I1.a); i.print();
		 */
     List<Integer> al = Arrays.asList(10,2,34,56);
    // al.forEach(n->System.out.println(n));
	/*
	 * for(int i=0;i<al.size();i++) { System.out.println(al.get(i)); }
	 */
	/*
	 * for(int i:al) { System.out.println(i); }
	 */
     
     Iterator<Integer> itr = al.iterator();
		/*
		 * while(itr.hasNext()) { System.out.println(itr.next()); }
		 */
     I1 i = (msg,n)-> {
    	 
    	 return msg+"in show "+"no."+n;
     };
    System.out.println(i.show("You are ",2));
}
}
