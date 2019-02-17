package Task4;

import java.util.ArrayList;

/**
 * Simple calculator
 * Created by Ilya Shpektorov 
 * 
 * Задание: 
 * Формируется новогодний подарок. Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр. 
 * Необходимо собрать подарок из сладостей. Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 * 
 */

public class Task4_2 {

    public static void main(String[] args) {
//		Здесь мы формируем подарок

        Gift firstGift = new Gift();
        
        firstGift.addToGift(new Jelly(100,2,firstGift.nameGenerator()+" мармеладка"));
        firstGift.addToGift(new Gum(40,1,firstGift.nameGenerator()+" жвачка"));
        firstGift.addToGift(new Candy(120,1.8,firstGift.nameGenerator()+" конфетка"));
        firstGift.addToGift(new Lollipop(25,0.5,firstGift.nameGenerator()+" сосалка"));
        firstGift.addToGift(new Chocolate(220,5,firstGift.nameGenerator()+" шоколадка"));


//		Здесь мы пробегаем по каждой сладости в подарке и выводим информацию о каждой конкретной
        for(PartOfGift x: firstGift.listOfCandys){
            System.out.println(x);
        }
//		Здесь мы выводим общую стоимость и вес подарка
        System.out.println(firstGift.getWeightOfGift());
        System.out.println(firstGift.getCostOfGift());
    }

	  public static class Gift {
	        ArrayList<PartOfGift> listOfCandys = new ArrayList<>();//список сладостей в подарке
	        public float weightOfGift; //общий вес
	        public double costOfGift; //общая стоимость

	        public Gift(){

	        }
	       public void addToGift(PartOfGift x){
	           listOfCandys.add(x);
	           this.weightOfGift = weightOfGift + x.weight;
	           this.costOfGift = costOfGift + x.cost$;
	       }
	       
//		    Здесь мы выводим общий вес подарка
	        public String getWeightOfGift() {
	            return "Общий вес подарка составляет: "+ this.weightOfGift+" грамм";
	        }

//	      	Здесь мы выводим общую стоимость подарка
	        public  String getCostOfGift() {
	            return "Общая стоимость подарка составляет: "+ this.costOfGift+"$";
	        }
//		    Здесь мы генерируем название	        
		    public String  nameGenerator() {
				String wordListOne [] = {
					"Сладкая","Кислая","Горькая","Ванильная","Забавная","Ласковая","Луковая","Вредная","Вонючая","Арахисовая","Жидкая","Игрушечная"
				};
				String wordListTwo [] = {
					"в глазури","огромная","вызывающая привыкание","любимая","с кусочками овощей","в пупырку","вафельная"
				}; 
				int oneLength = wordListOne.length;
				int twoLength = wordListTwo.length;
				
				
				int rand1 = (int) (Math.random() * oneLength);
				int rand2 = (int) (Math.random() * twoLength);
				
				String phraseComb = wordListOne[rand1]+" "+wordListTwo[rand2];	
				return phraseComb;

			}
	    }

//	    Здесь мы создаём части подарка
	    public static class PartOfGift {
	            public float weight;    //вес сладости
	            public double cost$;    //стоимость сладости
	            public String specialProp;  //особое свойство сладости

	            public PartOfGift(){ //конструктор по умолчанию
	            }

	            public PartOfGift(float weight,double cost$, String specialProp){   //конструктор с параметрами
	                this.weight = weight;
	                this.cost$=cost$;
	                this.specialProp=specialProp;
	            }

//			      Здесь мы возвращаем информациую об отдельной сладости в подарке
	        public String toString() {
	            return "В подарок входит сладость: "+this.specialProp+"\n"+"Ее вес(грамм): "+this.weight+"\n"+"Цена: "+this.cost$+"\n";
	        }
	    }
	    
//	      Здесь мы возвращаем информациую об отдельной сладости в подарке
	    public static class Jelly extends PartOfGift{
	        public Jelly(){ } //конструктор по умолчанию
	        public Jelly(float weight, double cost$, String specialProp){ //конструктор с параметрами
	            super(weight,cost$,specialProp);

	        }
	    }
	    
	    public static class Candy extends PartOfGift{
	        public Candy(){ }   //конструктор по умолчанию
	        public Candy(float weight, double cost$, String specialProp){   //конструктор с параметрами
	            super(weight,cost$,specialProp);
	        }
	    }
    
	    public static class Lollipop extends PartOfGift{
	        public Lollipop(){ }    //конструктор по умолчанию
	        public Lollipop(float weight, double cost$, String specialProp){    //конструктор с параметрами
	            super(weight,cost$,specialProp);
	        }
	    }
	    
	    public static class Gum extends PartOfGift{
	        public Gum(){ } //конструктор по умолчанию
	        public Gum(float weight, double cost$, String specialProp){ //конструктор с параметрами
	            super(weight,cost$,specialProp);
	        }
	    }
	    
	    public static class Chocolate extends PartOfGift{
	        public Chocolate(){ }   //конструктор по умолчанию
	        public Chocolate(float weight, double cost$, String specialProp){   //конструктор с параметрами
	            super(weight,cost$,specialProp);
	        }
	    }
}
