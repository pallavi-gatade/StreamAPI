package stream.practice;

import java.util.ArrayList;
import java.util.List;

public class PrintEvenOddByStream {

	public static void main(String[] args) {

		List<Integer> integerList = new ArrayList<>();
		integerList.add(18);
		integerList.add(22);
		integerList.add(35);
		integerList.add(41);
		integerList.add(59);
		
		System.out.println("Even Numbers by using stream : ");
		integerList.stream().filter(i -> i % 2 == 0).forEach(System.out :: println);
			
		System.out.println("Odd Numbers by using stream : ");
		integerList.stream().filter(i -> i % 2 != 0).forEach(System.out :: println);	
		
		System.out.println("Even and odd Numbers by using stream : ");
		integerList.stream().forEach(i -> {
			
			if(i % 2 == 0) 
				System.out.println("Even :" + i);
			else
				System.out.println("Odd :" + i);
		});
		
		System.out.println("Even Numbers by using Collection : ");
		integerList.forEach(i -> {
			if(i % 2 == 0) 
			System.out.println("Even :" + i);
		});
		System.out.println("odd Numbers by using Collection : ");
		integerList.forEach(i -> {
			if(i % 2 != 0) 
			System.out.print(i + " ");
		});
	}
}
