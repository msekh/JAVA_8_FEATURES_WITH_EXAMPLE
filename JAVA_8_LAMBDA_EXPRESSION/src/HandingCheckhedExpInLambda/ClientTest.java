package HandingCheckhedExpInLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ClientTest {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 5, 7, 0, 16, 23);
//	integers.add(3);
//	integers.add(5);
//	integers.add(7);
//	integers.add(9);
//	integers.add(13);
//	integers.add(15);

		integers.forEach(consumerWrapper(i -> System.out.println(50 / i),Exception.class));

		integers.forEach(consumerWrapper(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(50 / t);
			}
		},Exception.class));

	}
//catch Any type of data type 
	public static <T,E extends Exception> Consumer<T> consumerWrapper(Consumer<T> consumer, Class<E> clazz) {
		 return i -> {
		        try {
		            consumer.accept(i);;
		        } catch (Exception ex) {
		            try {
		                E exCast = clazz.cast(ex);
		                System.err.println(
		                  "Exception occured : " + exCast.getMessage());
		            } catch (ClassCastException ccEx) {
		                throw ex;
		            }
		        }
		    };
//		return i ->{
//			try {
//				consumer.accept(i);
//			}catch(ArithmeticException e) {
//				System.out.println("Arithmetic Exception occured: "+ e.getMessage());
//			}
//		};
	}
}
