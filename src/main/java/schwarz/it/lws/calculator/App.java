package schwarz.it.lws.calculator;

public class App {

    public static void main(String[] args) {
        CalculatorOperations calculatorOperations = new CalculatorOperationsService();
        CalculatorUI calculatorUI = new CalculatorUI(calculatorOperations);
        calculatorUI.run();
    }
}
