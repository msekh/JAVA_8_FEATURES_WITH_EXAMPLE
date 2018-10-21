package BiConsumerAndThenInLambda;

import java.util.function.BiConsumer;

public class ClientTest {
public static void main(String[] agrs) {
	BiConsumer<Integer, Integer> adder=(i1, i2)->System.out.println("Adder: "+(i1+i2));
	BiConsumer<Integer, Integer> multiplier=(i1, i2)->System.out.println("multiplier: "+(i1*i2));
	adder.andThen(multiplier).accept(30, 50);
	System.out.println("//---------------------------------//");
	multiplier.andThen(adder).accept(10, 30);
}
}
