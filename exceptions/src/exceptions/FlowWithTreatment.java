package exceptions;

public class FlowWithTreatment {

	public static void main(String[] args) {
		System.out.println("Inicial do main");

		try {
			method1();
		} catch (NullPointerException | ArithmeticException | CustomException ex) {
			String message = ex.getMessage();
			System.out.println("Exeption: " + message);
			ex.printStackTrace();
		}

		System.out.println("Fim do main");
	}

	private static void method1() throws CustomException {
		System.out.println("Ini do method1");

//		try {
		method2();
//		} catch (ArithmeticException ex) {
//			System.out.println("ArithmeticExeption");
//		}

		System.out.println("Fim do method1");
	}

	public static void method2() throws CustomException {
		System.out.println("Ini do method 2");

		throw new CustomException("Deu errado again");
		
	}
}
