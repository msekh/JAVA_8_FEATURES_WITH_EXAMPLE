package methodReferenceObjectParticularType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

class Computer {
	Random random = new Random();

	public int generateOrderNumber() {
		return random.nextInt(99999);
	}

	public List<Integer> orderComputer(List<Computer> l, Function<Computer, Integer> f) {
		List<Integer> results = new ArrayList<>();
		for(Computer s : l) {
			results.add(f.apply(s));
		}
		return results;
	}
}
