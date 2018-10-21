package BestPracticeLambda1;

import java.util.function.Function;

public class UseFoo {
	/*
	 * public String add(String name, Foo foo) { return foo.mehtod(name);
	 */
	public String add(String name, Function<String, String> f) {
		return f.apply(name);

	}
}
