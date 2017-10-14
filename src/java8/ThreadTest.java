package java8;

public class ThreadTest {
	
	public static void main(String[] args) {
		System.out.println();
		
		//Java 8·½Ê½£º
		new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
		
		new Thread(()->System.out.println("test1")).start();
		
	}

}
