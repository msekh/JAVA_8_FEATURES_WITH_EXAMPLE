package methodReferenceObjectParticularType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ShipmentOrder {
	public static void main(String[] args) {

		Computer computer = new Computer();
		List<Computer> l = new ArrayList<Computer>();
		l.add(new Computer());
		l.add(new Computer());

		// Using an anonymous class
		System.out.println("Anonymous Class: ");
		computer.orderComputer(l, new Function<Computer, Integer>() {

			@Override
			public Integer apply(Computer s) {
				int orderNum = s.generateOrderNumber();
				System.out.println(orderNum);
				return orderNum;
			}
		});

		// Using a lambda expression
		System.out.println("Lambda Expression: ");
		computer.orderComputer(l, s -> s.generateOrderNumber()).forEach(System.out::println);
		//Using method reference
		System.out.println("Method reference: ");
		computer.orderComputer(l, Computer::generateOrderNumber).forEach(System.out::println);

	}
}
