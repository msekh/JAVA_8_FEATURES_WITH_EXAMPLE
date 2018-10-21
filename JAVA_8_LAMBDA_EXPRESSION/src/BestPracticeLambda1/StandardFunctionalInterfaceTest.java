package BestPracticeLambda1;

import java.util.function.Function;

public class StandardFunctionalInterfaceTest {
	public static void main(String[] args) {

//		Foo foo = s -> s + " from Lambda";
//		UseFoo useFoo = new UseFoo();
//		String result = useFoo.add("Sekh", foo);
		Function<String, String> func=s->s+" From lamda";
		UseFoo useFoo = new UseFoo();
		String result=useFoo.add("Sekh", func);
		System.out.println(result);
	}
}
