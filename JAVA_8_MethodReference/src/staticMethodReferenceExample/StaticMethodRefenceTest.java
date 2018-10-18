package staticMethodReferenceExample;

import java.util.Arrays;
import java.util.List;

public class StaticMethodRefenceTest {
public static void main(String args[]) {
	List<String> heroes = Arrays.asList("Batman", "Superman", "Ironman", "Captain America", "Wonder Woman");
	heroes.forEach(h ->System.out.print(h+" "));
	
	heroes.forEach(System.out::println);
}
}
