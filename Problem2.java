package stream.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem2 {

	public static void main(String[] args) {
		
		Map<Integer, String> colors = new HashMap<Integer, String>();
		
		colors.put(1, "Blue");
		colors.put(2, "Apple");
		colors.put(3, "Black");
		colors.put(4, "Red");
		colors.put(5, "Yellow");
		colors.put(6, "Orange");
		colors.put(7, "White");
		colors.put(8, "Pink");
		colors.put(9, "Gray");
		colors.put(10, "SkyBlue");
		
		System.out.println("Input List is : " + colors);
		
		List<String> listOfValues = colors.values().stream().sorted().toList();
		
		System.out.println("Sorted List By Colors name: " + listOfValues);
		
		List<String> listOfValues2 =colors.values().stream().sorted((color1, color2) -> 
		color1. length() - color2.length()).toList();
		
		System.out.println("Sorted List By Colors length: " + listOfValues2);
		
		
		
//		List<String> list = new ArrayList<>();
//		list.add("B");
//		list.add("Z");
//		list.add("y");
//		list.add("O");
//		list.add("A");
//		list.stream().sorted().forEach(System.out :: println);
		
	}
}
