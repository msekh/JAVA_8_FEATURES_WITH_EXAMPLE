package BiPredicateFunctionInlambda;

import java.util.function.BiPredicate;

public class BiPredicateEx1 {

	public static void main(String[] args) {
		BiPredicate<String, String> predicate = (s1, s2) -> (s1.equals(s2));

		System.out.println(predicate.test("BORAJI", "BORAJI"));
		System.out.println(predicate.test("JAVA", "BORAJI"));

	}
}
