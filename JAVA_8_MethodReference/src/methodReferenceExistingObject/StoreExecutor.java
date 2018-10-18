package methodReferenceExistingObject;

import java.util.function.Consumer;

public class StoreExecutor {

	public static void main(String args[]) {
		final RepairStore repairStore = new RepairStore();

		// Using an anonymous class
		Computer computer = new Computer(10011, "HP");
		computer.execute(computer, new Consumer<Computer>() {

			@Override
			public void accept(Computer t) {
				repairStore.fix(t);
			}
		});
		// Using a lambda expression
		computer = new Computer(10012, "Dell");
		computer.execute(computer, c -> repairStore.fix(c));

		// Using a method reference
		computer = new Computer(10013, "Lenovo");
		computer.execute(computer, repairStore::fix);
	}
}