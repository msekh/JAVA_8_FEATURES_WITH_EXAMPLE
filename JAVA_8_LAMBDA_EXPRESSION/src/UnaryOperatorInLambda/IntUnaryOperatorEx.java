package UnaryOperatorInLambda;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorEx {

	public static void main(String[] args) {
		IntUnaryOperator operator = a -> a * 10;
		
		System.out.println(operator.applyAsInt(10));
		System.out.println(operator.applyAsInt(12));
	}
}
