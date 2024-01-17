package com.tutorials;

public class Pgm1 {

	public static void main(String[] args) {
		
		someMethod(null);
		
		int []a =new int[]{1,2,3,4,5,6,7,8,9,10};
	     int n= 4;
	     int j=n;
	     int []newArray = new int[10];

	     for(int i=0;i<a.length;i++){
	        if(j>=0){
	        for(j=n-1;j>=0;j--){
	        	newArray[i]=a[j];
	            i++;
	        }
	    }
	        newArray[i]=a[i];
	        
	    }
	    for(int i=0;i<newArray.length;i++){
	       System.out.print(newArray[i]);
	     }
	}
	
	public static void someMethod(Object o) {

		System.out.println("Object method Invoked");

	}

	public static void someMethod(String s) {

		System.out.println("String method Invoked");

	}
	/*
	 * public static void someMethod(Integer o) {
	 * 
	 * System.out.println("Integer method Invoked");
	 * 
	 * }
	 */
	}

