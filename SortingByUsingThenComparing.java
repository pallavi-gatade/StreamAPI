package stream.practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingByUsingThenComparing {

	public static void main(String[] args) {
	
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		
		map.put(1, new Employee(105, "P", 2300.0));
		map.put(2, new Employee(102, "A", 3300.0));
		map.put(3, new Employee(103, "L", 6700.0));
		map.put(4, new Employee(104, "V", 2300.0));
		map.put(5, new Employee(101, "I", 5300.0));
		
		System.out.println(map);
		
		List<Employee> list = map.values().stream().sorted((e1, e2) -> e1.getEmpId() - e2.getEmpId()).toList();
	
		System.out.println("Sort by IDs" + list);
		
		List<Employee> list2 = map.values().stream()
				.sorted(Comparator.comparing(Employee :: getEmpName)).collect(Collectors.toList());
		
		System.out.println("Sort by names" + list2);
		
		List<Employee> list3 = map.values().stream()
				.sorted(Comparator.comparing(Employee :: getEmpSalary)
						.thenComparing(Employee :: getEmpName)).toList();
		
		System.out.println("Sort by Salary And IDs" + list3);
		
	}
}
