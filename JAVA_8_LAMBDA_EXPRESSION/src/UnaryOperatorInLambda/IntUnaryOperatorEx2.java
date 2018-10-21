package UnaryOperatorInLambda;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorEx2 {
	public static void main(String[] args) {
		IntUnaryOperator operator1 = a -> a * 10;
		IntUnaryOperator operator2 = a -> a * a;

		// Using andThen()
		System.out.println(operator1.andThen(operator2).applyAsInt(10));

		// Using compose()
		System.out.println(operator1.compose(operator2).applyAsInt(10));
	}
}
