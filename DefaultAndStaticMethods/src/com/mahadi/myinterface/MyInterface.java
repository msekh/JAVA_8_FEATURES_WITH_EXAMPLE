package com.mahadi.myinterface;

import java.util.Collections;
import java.util.List;

import com.mahadi.model.Student;

public interface MyInterface {

	default public List<Student> sortStudents(List<Student> stuList){
		Collections.sort(stuList);
		return stuList;
	}
	
	public static void greet(String name) {
		System.out.println("Welcome: "+name);
	}
	//by default abstract method
	public Integer getMaxNum(List<Integer> intList);
	
}
