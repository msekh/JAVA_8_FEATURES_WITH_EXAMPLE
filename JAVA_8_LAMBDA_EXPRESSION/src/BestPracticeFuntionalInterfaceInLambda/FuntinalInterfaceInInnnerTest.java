package BestPracticeFuntionalInterfaceInLambda;

public class FuntinalInterfaceInInnnerTest {
	private String value = "Enclosing scop value";

	public static void main(String[] args) {
		new FuntinalInterfaceInInnnerTest().scopeExperiment();

	}

	private void scopeExperiment() {
		Foo foo = new Foo() {
			private String value = "inner class value";

			@Override
			public String method() {
				return this.value;
			}
		};
		System.out.println(foo.method());
		Foo foo2 = () -> {
			//String value = "Lamda Value";
			return this.value;
		};
		System.out.println(foo2.method());
	}
}

@FunctionalInterface
interface Foo {
	String method();
}