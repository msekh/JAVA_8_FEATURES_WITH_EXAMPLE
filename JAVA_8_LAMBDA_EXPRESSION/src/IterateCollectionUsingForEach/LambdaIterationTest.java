package IterateCollectionUsingForEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student t) {
		System.out.print(t);
	}
	
}
public class LambdaIterationTest {
	public static void main(String args[]) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Sekh", 29));
		students.add(new Student("Arisha", 3));
		//ForEach Lamnda
		students.forEach((s) ->{
			System.out.print("Name: "+s.getName()+" Age: "+s.getAge()+" ");
		});
		System.out.println();
		//Method reference
		students.forEach(System.out::println);
		//calling consumer
		students.forEach(new MyConsumer());
	}
}