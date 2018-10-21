package ReturnValue_LambdaEx;

public class LambdaExpWithReturnValue {
public static void main(String args[]) {
	MyInterface myInterface=(n1,n2) -> {
		return n1>n2;
	};
	System.out.println(myInterface.test(40, 35));
	System.out.println(myInterface.test(40, 50));
}
}
