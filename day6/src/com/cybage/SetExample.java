package com.cybage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		System.out.println("hello to day 6");
		
		//Set<String> skills = new HashSet<String>();
		//Set<String>skills = new LinkedHashSet<String>();
		Set<String>skills = new TreeSet<String>(Collections.reverseOrder());
		
		
		
		skills.add("java");
		skills.add("c");
		skills.add("python");
		skills.add("java");
		skills.add("adobe");
		
		System.out.println(skills);
		
		for(String s :skills){
			System.out.println(s);
		}
	
		Iterator<String> skillIterator = skills.iterator();
		while(skillIterator.hasNext()){
			System.out.println("through iterator  " + skillIterator.next());
		}
		
		Iterator<String> skillsIterator = skills.iterator();
	while(skillsIterator.hasNext()){
		if(skillsIterator.next().equals ("java")){
			skillsIterator.remove();
		}
	}

	System.out.println(skills);
		
	}
}
