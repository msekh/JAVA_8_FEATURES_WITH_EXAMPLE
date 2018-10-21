package IterateCollectionUsingForEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

 class Employee {
	private String name;
	private String email;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, String email, double salary) {
		super();
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}

}

public class IterateUsingMapTest {
	public static void main(String args[]) {
		Map<Integer, Employee> map = new HashMap<>();

		map.put(1001, new Employee("Sekh", "sm@gamil.com", 35000));
		map.put(1002, new Employee("Mahadi", "mm@gamil.com", 55000));
		map.put(1003, new Employee("Rupon", "rp@gamil.com", 50000));
		Set<Map.Entry<Integer, Employee>> entrySet = map.entrySet();
		for (Map.Entry<Integer, Employee> entry : entrySet) {
			System.out.print(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("//----------------------------//");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		map.forEach((k, v) -> System.out.println(k + " \t" + v));
	}
}
