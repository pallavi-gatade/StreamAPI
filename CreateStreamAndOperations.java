package stream.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Creates an empty stream

		Stream<String> emptyStream = Stream.empty();

		System.out.println(emptyStream.count());

//		Creation of stream

		Stream<String> singleElement = Stream.of(new String());

		System.out.println(singleElement.count());

//		Creation of stream		

		List<String> list = new ArrayList<>();
		list.add("44");
		list.add("2");
		list.add("183");
		list.add("6");
		list.add("3851");
		list.add("5");
		list.add("5700");
		list.add("25");
		list.add("90");
		System.out.println("Given List is :");

		// Iterate all the elements
		list.stream().forEach(System.out::println);

//	        Creates a stream from values
		Stream<Integer> numbers = Stream.of(2, 9, 5, 6, 3);

		System.out.println("number of count is : " + numbers.count());

//	        Selection Operations

//	        filtering elements 
		System.out.println("filtered List is :");
		list.stream().filter(element -> element.length() > 1).forEach(System.out::println);

//	        Distinct elements
		Stream<Integer> newNumbers = Stream.of(1, 3, 4, 2, 1, 9, 5, 4, 6, 9);
		System.out.println("Print Distinct elements :");
		newNumbers.distinct().forEach(System.out::println);

//	    Selects first n elements : limit()
		System.out.println("Selects first n elements :");
		list.stream().limit(5).forEach(System.out::println);

//	    Skips first n elements : skip() 
		System.out.println("Skips first n elements :");
		list.stream().skip(2).forEach(System.out::println);

//	     mapping operation
		System.out.println("Returns length of each name :");
		list.stream().map(String::length).forEach(System.out::println);

//	     Sorting elements 
		System.out.println("Sorted list :");
		list.stream().sorted().forEach(System.out::println);

//	     find minimum from the list
		List<Integer> newNumbersList = new ArrayList<>();
		newNumbersList.add(21);
		newNumbersList.add(30);
		newNumbersList.add(11);
		newNumbersList.add(8);
		newNumbersList.add(19);
		System.out.println("Print Minimum From the list:");
		Optional<Integer> min = newNumbersList.stream().min(Integer::compareTo);
		System.out.println(min);

//	    find Maximum from the list
		System.out.println("Print Maximum From the list:");
		Optional<Integer> max = newNumbersList.stream().max(Integer::compareTo);
		System.out.println(max);

//	     reduce: Concatenate all names into a single string
        
		Stream<Integer> newNumbers1 = Stream.of(2, 5, 7, 8, 1, 3, 9);
		int sum = newNumbers1.reduce(0, (a, b) -> a + b);
		System.out.println(sum);

//	    reduce (another way it returns optional value)  	        
		OptionalInt sum1 = Arrays.stream(new int[] { 32, 1, 5, 4, 3 }).reduce((a, b) -> a + b);
		System.out.println(sum1);

//		Collect into a list
		System.out.print("Storing first 5 elements into a list: ");
		List<String> firstNElement = list.stream().limit(5).collect(Collectors.toList());
		System.out.println(firstNElement);

//		Any one element matches - Check if any month start with 'J'

		System.out.println(list.stream().anyMatch((num) -> num.length() > 3));

		Stream<String> months = Stream.of("January", "February", "March", "May", "June", "July");

		boolean anyStartWithJ = months.anyMatch((name) -> name.startsWith("J"));

		System.out.println("any match start with 'J' : " + anyStartWithJ);
		
		
//		 all matches :  Check if all names start with 'J'
		Stream<String> names = Stream.of("January", "February", "March", "May", "June", "July");

		boolean allStartWithJ = names.allMatch((name) -> name.startsWith("J"));

		System.out.println("all start with 'J' : " + allStartWithJ);

	}

}
