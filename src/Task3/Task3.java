package Task3;

import java.util.Scanner;


/**
 * Simple calculator
 * Created by Ilya Shpektorov 
 * 
 * �������: ����������� ������� �������� ������������ (+,-,/,*) ��� ����������� ������� + 
 * �������: ����� ������������� �������� � �������. 
 * ��� ������ ������ ������ ����.
 * ����������� ������� �����������, �������� � �������. 
 * ����� ���� � ������� �������� ����� � ���������� ������ �������� ����� �������. 
 * � ���������� ������� ���������� ����� ����� ������� �����. ��������� ������� �� �������
 * ��������� ������ ��������� ���� �� ������� �� �����. ���� � ������� ������ 1 - ����������� ���������� ������������, ���� 2 - ����� ������������� ����� � �������.
 */

public class Task3 {

	public static void main(String[] args) {
		Task3 calc = new Task3();
		Scanner in = new Scanner(System.in);
		System.out.println("������� �������� \n" +
                "���� 1 - ����� ������������,\n"+
                "���� 2 - ����� ������ MAX �������� � �������, \n");
		int operation = in.nextInt();	
		switch (operation) { 
		case (1): calc.calculate();break;	
		case (2): calc.findMaxMassive();break;	
		default: System.out.println("����� �� ����������");
		in.close();
		}
	}

// 		����� ���������� ����������� � �������� ������������� 	
	public void calculate() {
		Scanner in = new Scanner(System.in);
		
//      ����� �� ������ ������ �����
        System.out.println("������� ������ �����:");
        float a = in.nextFloat();
        
//      ����� �� ������ ������ �����
        System.out.println("������� ������ �����:");
        float b = in.nextFloat();

      loop:  while (true) {
//      ����� �� �������� ��� ��������
        System.out.println("�������� �������������� �������� ( +, -, *, / ):");
        String c = in.next();

//      ����� �� �������� ����� � 4 ��������� ����� �������       
        switch (c) {
        case  ("+"):
        	 System.out.printf("��������� ��������: %.4f", (a + b));
        	break loop;
        case ("-"):
            System.out.printf("��������� ���������: %.4f", (a - b));
        	break loop;
        case ("*"):
            System.out.printf("��������� ���������: %.4f", (a * b));
        	break loop;
        case ("/"):
            System.out.printf("��������� �������: %.4f", (a / b));
        	break loop;
        default:
        	System.out.println("������ �������� �� ��������������.");
        	break;          
        } 
	}
        in.close(); 	
	}

//		����� ���������� ��������� �� ������ � ������ ������ �������� ����� � �������	
	public void findMaxMassive() {
		
		Scanner in = new Scanner(System.in);
		
//      ����� �� ������ ������ �������
        System.out.println("������� ������ �������:");
        int massiveCount = in.nextInt();
        
//      ����� �� ��������� ������ words � ����� ��� �����������
        String [] words = new String[massiveCount];
        
        int wLength = -1;
        int wNum = -1;
        
//      ����� �� ����������� �������� ��������� �������
        for(int x=0; x<massiveCount ;x++) {
        	System.out.println("������� �������� " + (x + 1) );       	
        	words[x] = in.next();    
        	
//      ����� �� ���������� ����� ������� �������� ������� (���� ���� ��������� �������� � ���������� �������, �� ����� �������� ������ ��������)    	
        	 if (wLength < words[x].length()) {
        		 wLength = words[x].length();
                 wNum = x;
        	 }               
        }
        
//      ����� �� ������� ����� ������� �������� �������  
        System.out.println("����� ������� �������� � �������: " + words[wNum]);
        in.close(); 
	}
}
