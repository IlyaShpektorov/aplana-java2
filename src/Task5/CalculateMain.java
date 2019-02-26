package Task5;

import java.util.Scanner;

import Task2.Task2;

public class CalculateMain {

	public static void main(String[] args) {
		  Operand leftOperand, rightOperand;
	        Operation operation;

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Введите первое число:");
	        leftOperand = new Operand(scanner.nextDouble());

	        System.out.println("Введите второе число:");
	        rightOperand = new Operand(scanner.nextDouble());
	        
	        System.out.println("Выберите математическую операцию ( +, -, *, / ):");
	        operation = Operation.getBySymbol(scanner.next().charAt(0));

	        Logic calc = new Logic(leftOperand, rightOperand, operation);

	        System.out.println("Результат вычислений: " + calc.getResult());

	        scanner.close();
			}
}