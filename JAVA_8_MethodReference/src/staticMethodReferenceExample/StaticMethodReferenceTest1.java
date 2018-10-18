package staticMethodReferenceExample;

interface Sayable {
	void say();
}

class MethodReference {
	public static void saySomething() {
		System.out.println("Hello,This is static method.");
	}
}

public class StaticMethodReferenceTest1 {
	public static void main(String args[]) {
		// Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        // Calling interface method  
        sayable.say();
	}
}
