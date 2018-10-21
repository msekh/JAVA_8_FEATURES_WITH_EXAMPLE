package UnaryOperatorInLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(2,4,5,7,8,10);
	UnaryOperator<Integer> unaryOpt=i ->i*i;
	
	unaryOperatorFunction(unaryOpt, list).forEach(x ->System.out.println(x));
}
private static List<Integer> unaryOperatorFunction(UnaryOperator<Integer> unaryOpt, List<Integer> list){
	List<Integer> uniList=new ArrayList<>();
	list.forEach(i ->uniList.add(unaryOpt.apply(i)));
	return uniList;	
}
}
