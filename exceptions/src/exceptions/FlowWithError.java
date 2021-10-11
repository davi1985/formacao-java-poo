package exceptions;

public class FlowWithError {

	public static void main(String[] args) {
		System.out.println("Inicial do main");

		try {
			method1();
		} catch (Exception ex) {
			String message = ex.getMessage();
			System.out.println("Exeption: " + message);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void method1() {
		System.out.println("Ini do method1");

//		try {
		method2();
//		} catch (ArithmeticException ex) {
//			System.out.println("ArithmeticExeption");
//		}

		System.out.println("Fim do method1");
	}

	public static void method2() {
	
		System.out.println("Method 2 start");
		method2();
		System.out.println("Method 2 end");
//		System.out.println("Fim do method 2");
	}
}
