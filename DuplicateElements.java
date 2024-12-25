package stream.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 5, 1, 66, 34, 62, 23, 66);
		
	    Set<Integer> set = new HashSet<Integer>();
	    
	    list.stream().filter(i -> !set.add(i)).forEach(System.out :: println);
		
	}

}
