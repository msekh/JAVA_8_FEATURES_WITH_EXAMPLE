package ClousureLambda_JAVA_8;

public class Test {
	public static void main(String[] args) {
		int x = 30;
		int y = 40;
		
		doOperate(x, new Operation() {
			
			@Override
			public void operate(int n) {
				System.out.println(n+y);
			}
		});
		doOperate(x, (n) ->System.out.println(n+y));

	}
	private static void doOperate(int  i, Operation o) {
		o.operate(i);
	}
}
