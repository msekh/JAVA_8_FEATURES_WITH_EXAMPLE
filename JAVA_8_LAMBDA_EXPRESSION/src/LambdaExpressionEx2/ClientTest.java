package LambdaExpressionEx2;

public class ClientTest {
	public static void main(String args[]) {
//		MyInterface My1 = new MyInterface() {
//			@Override
//			public void method1() {
//				System.out.println("My class interface.");
//			}
//		};
//		My1.method1();
		MyInterface my = () -> {System.out.println("This method using lambda.");		};
		my.method1();

		MyInterface1 my2 = (name) -> {System.out.println(name);};
		my2.method2("Sekh Mahadi.");

		MyInterface3 myIn3 = (name, age) -> System.out.println("My name is: " +name+ " " + "My age is:" + age);
		myIn3.method3("mahadi", 29);
	}
}
