package com.cybage;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductExample {
	
	public static void main(String[] args) {
		
		//Set<Product>products = new HashSet<Product>();
		Set<Product>products = new TreeSet<Product>(new IdComparator());

		products.add(new Product(101,"computer",3500,15));
		products.add(new Product(102,"laptop",4500,10));
		products.add(new Product(103,"printer",1200,5));
		products.add(new Product(104,"server",35000,2));
		products.add(new Product(105,"scanner",350,15));
		products.add(new Product(101,"computer",3500,15));
		
		System.out.println(products);
		
	}
}
