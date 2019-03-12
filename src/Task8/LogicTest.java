package Task8;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Simple calculator
 * Created by Ilya Shpektorov 
 * 
 * Задание: Покрыть Unit тестами последний проект с калькулятором
 */
public class LogicTest {

	 	@Test
	    public void testValidAddition() {
	        Logic calc = new Logic(new Operand(2), new Operand(3), Operation.ADDITION);
	        assertEquals("2 + 3 = 5", 5, calc.getResult(), 0.1);
	        System.out.println("Test 1 - ok");
	    }

	    @Test
	    public void testValidSubstraction() {
	    	Logic calc = new Logic(new Operand(2), new Operand(3), Operation.SUBTRACTION);
	        assertEquals("2 - 3 = -1", -1, calc.getResult(), 0.1);
	        System.out.println("Test 2 - ok");
	    }

	    @Test
	    public void testValidMultiplication() {
	    	Logic calc = new Logic(new Operand(3), new Operand(3), Operation.MULTIPLICATION);
	        assertEquals("3 * 3 = 9", 9, calc.getResult(), 0.1);
	        System.out.println("Test 3 - ok");
	    }

	    @Test
	    public void testValidDivision() {
	    	Logic calc = new Logic(new Operand(2), new Operand(2), Operation.DIVISION);
	        assertEquals("2 / 2 = 1", 1, calc.getResult(), 0.1);
	        System.out.println("Test 4 - ok");
	    }
	}
