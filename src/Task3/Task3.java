package Task3;

import java.util.Scanner;


/**
 * Simple calculator
 * Created by Ilya Shpektorov 
 * 
 * Задание: Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания + 
 * Сделать: Поиск максимального элемента в массиве. 
 * Для начала задать массив слов.
 * Размерность массива произвольна, задается в консоли. 
 * После чего в консоли вводятся слова в количестве равном заданной длине массива. 
 * В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 * Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 */

public class Task3 {

	public static void main(String[] args) {
		Task3 calc = new Task3();
		Scanner in = new Scanner(System.in);
		System.out.println("Укажите операцию \n" +
                "если 1 - режим калькулятора,\n"+
                "если 2 - режим поиска MAX значения в массиве, \n");
		int operation = in.nextInt();	
		switch (operation) { 
		case (1): calc.calculate();break;	
		case (2): calc.findMaxMassive();break;	
		default: System.out.println("Режим не установлен");
		in.close();
		}
	}

// 		Метод вызывающий калькулятор с базовыми возможностями 	
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
	}

//		Метод вызывающий процедуру по поиску и выводу самого длинного слова в массиве	
	public void findMaxMassive() {
		
		Scanner in = new Scanner(System.in);
		
//      Здесь мы вводим размер массива
        System.out.println("Введите размер массива:");
        int massiveCount = in.nextInt();
        
//      Здесь мы объявляем массив words и задаём его размерность
        String [] words = new String[massiveCount];
        
        int wLength = -1;
        int wNum = -1;
        
//      Здесь мы присваеваем значения элементам массива
        for(int x=0; x<massiveCount ;x++) {
        	System.out.println("Укажите значение " + (x + 1) );       	
        	words[x] = in.next();    
        	
//      Здесь мы определяем самое длинное значение массива (если есть несколько значений с одинаковой длинной, то будет выведено первое значение)    	
        	 if (wLength < words[x].length()) {
        		 wLength = words[x].length();
                 wNum = x;
        	 }               
        }
        
//      Здесь мы выводим самое длинное значение массива  
        System.out.println("Самое длинное значение в массиве: " + words[wNum]);
        in.close(); 
	}
}
