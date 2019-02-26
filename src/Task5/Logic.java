package Task5;

public class Logic {
	
		private Operand leftOperand;
	    private Operand rightOperand;
	    private Operation operation;

	    Logic(Operand leftOperand, Operand rightOperand, Operation operation) {
	        this.leftOperand = leftOperand;
	        this.rightOperand = rightOperand;
	        this.operation = operation;
	    }

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