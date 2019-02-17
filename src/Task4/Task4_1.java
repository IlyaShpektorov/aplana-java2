package Task4;

import java.util.Arrays;
import java.util.Random;

/**
 * Simple calculator
 * Created by Ilya Shpektorov 
 * 
 * Задание: 
 * Массив размерностью 20, заполняется случайными целыми числами от -10 до 10. 
 * Найти максимальный отрицательный и минимальный положительный элементы массива. 
 * Поменять их местами.
 * 
 */

public class Task4_1 {

	public static void main(String[] args) {
	Task4_1 minMax = new Task4_1();
	minMax.intMass();

	}

	public void intMass () {
//      Здесь мы создаём массив размерностью 20
	    int arr[] = new int[20];
        int i = 0, a = 0;
        int x = -10, xi = 0;
        int y = 10, yi = 0;
        
//      Здесь мы присваиваем случайные значения элементам массива и определяем min / max и выводим массив
        System.out.println("Изначальный массив:");
        while (i < 20) {
            arr[i] = (int) (Math.random() * 20) - 10;
            if (arr[i] < 0 & arr[i] > x) {
                x = arr[i];
                xi = i;
            }
            if (arr[i] > 0 & arr[i] < y){
                y = arr[i];
                yi = i;
            }
            System.out.print(arr[i] + "   ");
            i += 1;
        }
        
//      Здесь мы  меняем минимальное положительное число и максимальное отрицательное местами и выводим результат
        System.out.println("\n\nИзмененный массив:");
       
        a = arr[xi];
        arr[xi] = arr[yi];
        arr[yi] = a;
        for (int c:arr) {
            System.out.print(c + "   ");
        }

    }
}