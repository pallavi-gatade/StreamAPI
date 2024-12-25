package stream.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCountByStream {

	public static void main(String[] args) {

//			String s = "programmingproblems";
//
//			   Map<Character, Long> countMap = s.chars()
//			   .mapToObj(c -> (char) c)
//			   .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//
//			    System.out.println("Character count :");
//			    countMap.forEach((key, value) -> System.out.println(key + " : " + value));
			    
			    
			    String str= "programmingproblems";  
			    Map<String, Long> result = Arrays.stream(str.split(""))
			    		.map(String::toLowerCase)
			    		.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));  
			    
			    System.out.println(result); 
			    
			   
			       String st = "programmingproblems";
			       char ch = 'r';
			       
			       long count = st.chars().filter(c -> c == ch).count();
			       System.out.println("The occurrence of" + ch + "is:" + count);
			    
	}

}
