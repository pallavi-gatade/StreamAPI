package stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperations {
	
	    public static void main(String[] args) {
	        // Sample data
	        List<String> city = Arrays.asList(
	            "Pune", "Sangali", "Satara", "Kokan", "Latur", "Parbhani", "Solapur");

	        System.out.println("Given list :");
	        
	        // Print each elements
	        city.stream().forEach(System.out::println);

	        // collect: Collect names starting with 'S' into a list
	        List<String> sNames = city.stream()
	                                   .filter(c -> c.startsWith("S"))
	                                   .collect(Collectors.toList());
	        System.out.println("\ncollect (names starting with 'S'):");
	        sNames.forEach(System.out::println);

	        // reduce: Concatenate all names into a single string
	        String concatenatedNames = city.stream().reduce(
	            "",
	            (partialString, element) -> partialString + " " + element
	        );
	        System.out.println("\nreduce (concatenated names):");
	        System.out.println(concatenatedNames.trim());

	        // count: Count the number of names
	        long count = city.stream().count();
	        System.out.println("\ncount:");
	        System.out.println(count);

	        // findFirst: Find the first name
	        Optional<String> firstName = city.stream().findFirst();
	        System.out.println("\nfindFirst:");
	        firstName.ifPresent(System.out::println);

	        // allMatch: Check if all names start with 'S'
	        boolean allStartWithS = city.stream().allMatch(
	            name -> name.startsWith("S")
	        );
	        System.out.println("\nallMatch (all start with 'S'):");
	        System.out.println(allStartWithS);

	        // anyMatch: Check if any name starts with 'S'
	        boolean anyStartWithS = city.stream().anyMatch(
	            name -> name.startsWith("S")
	        );
	        System.out.println("\nanyMatch (any start with 'S'):");
	        System.out.println(anyStartWithS);
	    }
	}
