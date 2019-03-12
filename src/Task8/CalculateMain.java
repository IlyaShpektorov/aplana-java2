package Task8;

import java.util.Scanner;

import Task2.Task2;

/**
 * Simple calculator
 * Created by Ilya Shpektorov 
 * 
 * Задание: Покрыть Unit тестами последний проект с калькулятором
 */

public class CalculateMain {

	public static void main(String[] args) {
		  Operand leftOperand, rightOperand;
	        Operation operation;

	    try (Scanner scanner = new Scanner(System.in)){
	        System.out.println("Введите первое число:");
	        leftOperand = new Operand(scanner.nextDouble());

	        System.out.println("Введите второе число:");
	        rightOperand = new Operand(scanner.nextDouble());
	        
	        System.out.println("Выберите математическую операцию ( +, -, *, / ):");
	        operation = Operation.getBySymbol(scanner.next().charAt(0));

	        Logic calc = new Logic(leftOperand, rightOperand, operation);

	        System.out.println("Результат вычислений: " + calc.getResult());

	        scanner.close();
			}catch (RuntimeException e) {
	            System.out.println("Во время работы калькулятора произошла ошибка. " + e.getLocalizedMessage());
			}
	}
}