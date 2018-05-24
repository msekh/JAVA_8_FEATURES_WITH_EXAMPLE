package com.mahadi.client;

import java.util.ArrayList;
import java.util.List;

import com.mahadi.model.Student;
import com.mahadi.myinterface.MyInterface;
import com.mahadi.myinterfaceImpl.MyClass;

public class ClientTest {
	public static void main(String[] args) {
		
		MyInterface myInterface = new MyClass();
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("sekh", 28));
		stuList.add(new Student("mahadi", 29));
		stuList.add(new Student("babul", 30));
		List<Student> sortStudents = myInterface.sortStudents(stuList);

		for (Student student : sortStudents) {
			System.out.println(student.getName() + "\t" + student.getAge());
		}

		System.out.println("-----------------------------");
		MyInterface.greet("sekh");
		
		System.out.println("-----------------------------");
		List<Integer> intList=new ArrayList<>();
		
		intList.add(900);
		intList.add(50);
		intList.add(100);
		intList.add(90);
		intList.add(200);
		
		Integer maxNum=myInterface.getMaxNum(intList);
		System.out.println("Max num: "+maxNum);
	}
}
