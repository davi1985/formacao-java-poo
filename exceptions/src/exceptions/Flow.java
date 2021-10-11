package exceptions;

public class Flow {
	public static void main(String[] args) {
		System.out.println("Inicial do main");

		try {
			method1();
		} catch (NullPointerException | ArithmeticException ex) {
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
		System.out.println("Ini do method 2");

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);

			int a = i / 0;
		}

		System.out.println("Fim do method 2");
	}
}
