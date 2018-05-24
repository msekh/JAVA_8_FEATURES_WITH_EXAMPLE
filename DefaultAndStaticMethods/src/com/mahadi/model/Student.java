package com.mahadi.model;

public class Student implements Comparable<Student>{
 private String name;
 private Integer age;
 
public Student(String name, Integer age) {
	super();
	this.name = name;
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}

@Override
public int compareTo(Student o) {
	
	return this.getName().compareTo(o.getName());
}

@Override
public String toString() {
	return "Student [name=" + name + ", age=" + age + "]";
}
 

}
