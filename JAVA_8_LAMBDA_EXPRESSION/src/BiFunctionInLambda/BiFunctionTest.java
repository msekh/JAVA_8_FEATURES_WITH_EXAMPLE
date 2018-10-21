package BiFunctionInLambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionTest {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> function1 = (a, b) -> a + b;
		Function<Integer, Integer> function2 = (n) -> n * n;

		// Using andThen()
		System.out.println(function1.andThen(function2).apply(5, 3));
		System.out.println(function1.andThen(function2).apply(12, 2));
	}
}
