package LambdaExpressionBestPracticesDemo;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {
	public static void main(String[] args) {
		BiFunction<String, String, String> biFunction = (s1, s2) -> getFullName(s1, s2);
		String fulName = biFunction.apply("Sekh", "Mahadi");
		System.out.println(fulName);

		System.out.println("------------------");

		Function<String, String> function = s -> "Hi," + s;
		String apply = function.apply("Sekh");
		System.out.println(apply);
		System.out.println("----------------------------");
		Function<String, String> function1 = s -> s.toUpperCase();
		// Function<String, String> function1 =String::toUpperCase;

		String result = function1.apply("Sean");
		System.out.println(result);
		
		new Test().method();
	}

	private void method() {
		String localVariable="local";
		Function<String, String> f=s ->{
			return localVariable;
		};
	String result=f.apply("Sekh");
	System.out.println(result);
		
	}

	private static String getFullName(String s1, String s2) {
		String firstName = s1.toUpperCase();
		String lastName = s2.toUpperCase();
		String result = firstName + "\t" + lastName;
		return result;
	}
}
