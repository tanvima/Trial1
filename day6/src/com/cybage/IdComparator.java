package com.cybage;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {

	public int compare(Product o1, Product o2) {
		
		return o2.getId()-o1.getId();
	}

}
