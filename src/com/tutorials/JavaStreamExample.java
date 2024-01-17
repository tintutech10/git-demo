package com.tutorials;

import java.util.*;
import java.util.stream.Collectors;  
class Product{  
    int id;  
	String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    @Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        List<Product> productsList1 = new ArrayList<>();
       //productsList.stream().filter(p->p.price>28000).map(p->p.price).collect(Collectors.toList()).forEach(System.out::println);
        productsList.stream().filter(p->p.price>28000).forEach(p->System.out.println(p));
        productsList.stream().filter(p->p.price>28000).forEach(p->System.out.println(p.price));
        productsList.stream().filter(p->p.price>28000).map(p->p.price*10).forEach(p->System.out.println(p));
        Float totalPrice=productsList.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum+price);
       //System.out.println(totalPrice);
		/*
		 * for(Product product: productsList){
		 * 
		 * // filtering data of list if(product.price>28000){
		 * productsList1.add(product); // adding price to a productPriceList } }
		 * //productsList1.forEach(p->System.out.println(p)); for (Product
		 * p:productsList1) { System.out.println(p); }
		 */
       //productsList.stream().map(p->p.price).forEach(System.out::println);
    }  
}  