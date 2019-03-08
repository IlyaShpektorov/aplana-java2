package Task6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Simple calculator
 * Created by Ilya Shpektorov 
 * 
 * Задание: Прочитать слова из файла. 
 * Отсортировать в алфавитном порядке.
 * Посчитать сколько раз каждое слово встречается в файле.    
 * Вывести статистику на консоль 
 * Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле
 * 
 */

public class Task6 {
	   public static void main(String[] args) {
	        Scanner fileScanner;
	        try {
	            fileScanner = new Scanner(new File("src\\Task6\\wFile.txt"));
	        } catch (FileNotFoundException e) {
	            System.out.println("Файл не найден!");
	            return;
	        }

	        Map<String, Integer> words = new TreeMap<>();
	        int max = 0;
	        String maxWord = null;
	        while (fileScanner.hasNext()) {
	            String word = fileScanner.next();
	            int counter = words.getOrDefault(word, 0);
	            counter++;
	            if (counter > max) {
	                max = counter;
	                maxWord = word;
	            }
	            words.put(word, counter);
	        }

	        System.out.println("Сортировка слов в алфавитном порядке: " + words.keySet());

	        System.out.println("Статистика по использованию слов:");
	        for (Map.Entry<String, Integer> entry : words.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue() + " раз(а)");
	        }

	        System.out.println("Слово с максимальным количеством повторений: " + maxWord + " (" + max + " повтора)");
	    }
	}