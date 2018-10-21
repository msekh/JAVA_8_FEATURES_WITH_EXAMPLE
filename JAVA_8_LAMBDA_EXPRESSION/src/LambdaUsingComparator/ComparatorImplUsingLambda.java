package LambdaUsingComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImplUsingLambda {
	public static void main(String args[]) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Sekh", "sm@gamil.com", 35000));
		empList.add(new Employee("Mahadi", "mm@gamil.com", 55000));
		empList.add(new Employee("Rupon", "rp@gamil.com", 50000));
		System.out.println("Employee Before Sorted: ");
		empList.forEach(System.out::println);
		System.out.println("//-----------------------------//");
		// Collections.sort(empList, new EmployeeNameSorter());

//		Collections.sort(empList, new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		Collections.sort(empList, (e1,e2)-> e1.getName().compareTo(e2.getName()));
		System.out.println("Employee After Sorted: ");
		empList.forEach(System.out::println);
	}
}
