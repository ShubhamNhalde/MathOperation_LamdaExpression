package www.bridgelabz.MathOperation;

//Created Functional Interface
@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);
	
	static void printResult(int a, int b, String function, IMathFunction fobj) {
		System.out.println("Result of " + function + " is " + fobj.calculate(a, b));
	}
}

	public class MathOperationApp {

		public static void main(String[] args) {
			System.out.println("Welcome to Math Operation App using Lambda Expression:");

			// Using Method Reference instead of Lambda Expression
			// This expression implements 'IMathFunction' interface
			IMathFunction add = Integer::sum;

			// Lambda expression for multiplication & division for two parameters.
			// This expression implements 'IMathFunction' interface
			IMathFunction multiply = (x, y) -> x * y;
			IMathFunction divide = (int x, int y) -> x / y;
			
			// Passing Lambda Expression as Function Parameter to Print Result using Static Function
			IMathFunction.printResult(6, 3, "Addition", add);
			IMathFunction.printResult(6, 3, "Multiplication", multiply);
			IMathFunction.printResult(6, 3, "Division", divide);
		}
}
