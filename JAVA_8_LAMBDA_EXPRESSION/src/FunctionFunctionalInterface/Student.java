package FunctionFunctionalInterface;

import java.util.function.Function;

public class Student {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Student(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
public String customShow(Function<Student, String> function) {
return function.apply(this);	
}
}
