package Task2;

import java.util.Scanner;

/**
 * Simple calculator
 * Created by Ilya Shpektorov 
 * 
 * Задание: Реализовать сложение дробных чисел, которые пользователь вводит в консоль. 
 * Использовать комментарии и JavaDoc при описании метода.
 * Использовать форматирование при выводе результата в консоль. 
 * Полученный результат округлять до 4-х знаков после запятой.
 *  *Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 */

public class Task2 {

	public static void main(String[] args) {
		Task2 calc = new Task2();
		calc.calculate();		
	}

	public void calculate() {
		Scanner in = new Scanner(System.in);
		
//      Здесь мы вводим первое число
        System.out.println("Введите первое число:");
        float a = in.nextFloat();
        
//      Здесь мы вводим второе число
        System.out.println("Введите второе число:");
        float b = in.nextFloat();

      loop:  while (true) {
//      Здесь мы выбираем тип операции
        System.out.println("Выберите математическую операцию ( +, -, *, / ):");
        String c = in.next();

//      Здесь мы получаем ответ с 4 символами после запятой
       
        switch (c) {
        case  ("+"):
        	 System.out.printf("Результат сложения: %.4f", (a + b));
        	break loop;
        case ("-"):
            System.out.printf("Результат вычитания: %.4f", (a - b));
        	break loop;
        case ("*"):
            System.out.printf("Результат умножения: %.4f", (a * b));
        	break loop;
        case ("/"):
            System.out.printf("Результат деления: %.4f", (a / b));
        	break loop;
        default:
        	System.out.println("Данная операция не поддерживается.");
        	break;          
        } 
	}
        in.close(); 	
}}
