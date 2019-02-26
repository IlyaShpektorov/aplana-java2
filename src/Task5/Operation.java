package Task5;
/**
 *  Класс описывает возможные операции калькулятора 
 */
public enum Operation {
    ADDITION('+'),
    SUBTRACTION('-'),
    MULTIPLICATION('*'),
    DIVISION('/');

    private char operationSymbol;

    Operation(char symbol) {
        this.operationSymbol = symbol;
    }

    public static Operation getBySymbol(char symbol) {
        for (Operation operation : Operation.values()) {
            if (operation.operationSymbol == symbol) {
                return operation;
            }
        }
        return null;
    }
}
