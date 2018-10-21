package ThisReferenceLambda;

import ClousureLambda_JAVA_8.Operation;

public class ThiReferenceInLambda {
	public void process() {
		doOperate(30, n->{
			System.out.println(30+n);
			System.out.println(this);
		});
	}
	public static void main(String args[]) {
		int b=90;
		ThiReferenceInLambda.doOperate(b, (n)-> {
				System.out.println(b+n);
			    //System.out.println(this);
		});
		new ThiReferenceInLambda().process();
	}
	private static void doOperate(int  i, Operation o) {
		o.operate(i);
	}
}
