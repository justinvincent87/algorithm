package com.util.algorithm.interview;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class OrderByValue {
	
	public static void main(String[] args) {
		Map<String, Integer> empSalaray = new LinkedHashMap<String, Integer>();
		empSalaray.put("Vinoth", 4000);
		empSalaray.put("Kumar", 3500);
		empSalaray.put("Arun", 1950);
		empSalaray.put("Vijay", 3700);
		
		System.out.println(empSalaray);
		
		List<Entry<String, Integer>> entryList = new LinkedList<Entry<String, Integer>>(empSalaray.entrySet());
		Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		System.out.println(entryList.get(0).getValue());
		
		for(Entry<String, Integer> emp : entryList) {
			System.out.println(emp.getKey() + " --> " + emp.getValue());
		}
		empSalaray.clear();
		empSalaray = entryList.stream().collect(Collectors.toMap(Entry::getKey, Entry::getValue));
		System.out.println(empSalaray);
	}
}
