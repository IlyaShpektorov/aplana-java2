package Task8;

/**
 *  Класс описывает логику работы калькулятора
 */
public class Logic {
		/** Первое значение в выражении */
		private Operand leftOperand;
		/** Второе значение в выражении */
	    private Operand rightOperand;
	    /** Оператор  выражения */
	    private Operation operation;

	    /** Конструктор класса Logic */
	    Logic(Operand leftOperand, Operand rightOperand, Operation operation) {
	        this.leftOperand = leftOperand;
	        this.rightOperand = rightOperand;
	        this.operation = operation;
	    }
	    /** определение выражения и возврат результата */
	    double getResult() {
	        double result = 0;

	        switch (operation) {
	            case ADDITION: {
	                result = leftOperand.getValue() + rightOperand.getValue();
	                break;
	            }
	            case SUBTRACTION: {
	                result = leftOperand.getValue() - rightOperand.getValue();
	                break;
	            }
	            case MULTIPLICATION: {
	                result = leftOperand.getValue() * rightOperand.getValue();
	                break;
	            }
	            case DIVISION: {
	                result = leftOperand.getValue() / rightOperand.getValue();
	                break;
	            }
	        }
	        return result;
	    }
	}