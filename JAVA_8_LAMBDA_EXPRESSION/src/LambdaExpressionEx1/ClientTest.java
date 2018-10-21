package LambdaExpressionEx1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {

	public static void main(String[] args) {

		createThreadUsingAnonymousClass();
		createThreadUsingLamdaExpression();
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Andrew");
		nameList.add("Sean");
		nameList.add("Rocky");
		nameList.forEach(new Consumer<String>() {

			@Override
			public void accept(String name) {		
				System.out.println(name);
			}
		});
		//nameList.forEach((name)-> System.out.println(name));
		//nameList.forEach(System.out::println);
		
	}

	private static void createThreadUsingLamdaExpression() {
		Runnable r=	()-> {System.out.println("My task is executing..");};
		Thread thread = new Thread(r);
		thread.start();
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r=	new Runnable() {
			@Override
			public void run() {
				System.out.println("My task is executing..");
			}
		};
		
		Thread thread = new Thread(r);
		thread.start();
	}
}
