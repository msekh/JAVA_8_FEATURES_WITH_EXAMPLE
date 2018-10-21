package LambdaStaticMethodReference;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LamdaStaticMethodTest {
	public static void main(String args[]) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Runnable command = () -> System.out.println("My task is running.");
		executorService.execute(command);
	} 
}
