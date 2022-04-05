package www.bridgelabz.MathOperation;

//Created Functional Interface
@FunctionalInterface
interface IMathFunction {
	int calculate(int a, int b);
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

			// Add,Multiply & Divide two numbers using lambda expression
			System.out.println("Addition is " + add.calculate(6, 3));
			System.out.println("Multiplication is " + multiply.calculate(6, 3));
			System.out.println("Division is " + divide.calculate(6, 3));
		}
}
