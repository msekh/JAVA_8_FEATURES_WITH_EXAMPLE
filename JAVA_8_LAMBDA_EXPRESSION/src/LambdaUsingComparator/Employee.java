package LambdaUsingComparator;

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