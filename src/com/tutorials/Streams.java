package com.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		List<String> al1 = Arrays.asList("Book","pen","Pencil");
		List<String> al2 = Arrays.asList("mobile","Television","Bulb");
		List<Integer> intList = Arrays.asList(10,20,30,5,15,10,30);
		List<String> asd = new ArrayList<String>();
		asd.addAll(al1);
		asd.addAll(al2);
		asd.forEach(x->System.out.println(x));
		long n = asd.stream().count();
		System.out.println(n);
		Stream<String> sl = asd.stream().limit(2);
		sl.forEach(x->System.out.println(x));
		intList.stream().sorted().forEach(x->System.out.println(x));
		long sum = intList.stream().mapToInt(x->x).sum();
		System.out.println("sum "+sum);
		intList.stream().distinct().forEach(System.out::println);
		
	}

}
