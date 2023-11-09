package schwarz.it.lws.calculator;

import java.util.Scanner;

public class CalculatorUI {
    private final CalculatorOperations calculatorOperations;
    private final Scanner scanner = new Scanner(System.in);

    public CalculatorUI(CalculatorOperations calculatorOperations) {
        this.calculatorOperations = calculatorOperations;
    }

    public void run() {
        boolean isRunning = true;

        while (isRunning) {
            showMainMenu();

            try {
                String choice = selectOperation("12345679");

                if (choice.equals("9")) {
                    isRunning = false;
                    System.out.println("Bye Bye ...");
                    continue;
                }

                double result = switch (choice) {
                    case "1" -> calculatorOperations.add(scanner);
                    case "2" -> calculatorOperations.sub(scanner);
                    case "3" -> calculatorOperations.mul(scanner);
                    case "4" -> calculatorOperations.div(scanner);
                    case "5" -> calculatorOperations.percent(scanner);
                    case "6" -> calculatorOperations.square(scanner);
                    case "7" -> calculatorOperations.modulo(scanner);
                    default -> 0;
                };

                showResult(result);

            } catch (Exception ex) {
                showError(ex.getMessage());
            }
        }
    }

    private void showResult(double result) {
        System.out.println("--------------------");
        System.out.println("Result: " + result);
        System.out.println("====================");
    }

    private void showMainMenu() {
        System.out.println("- - - - Calculator - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("1-Addition, 2-Subtraktion, 3-Multiplication, 4-Division, 5-Prozent, 6-Square, 7-Modulo, 9-Quit");
    }

    private String selectOperation(String validOptions) {
        String input = calculatorOperations.inputWithPrompt("Select:", scanner);
        if (!validOptions.contains(input)) {
            throw new IllegalArgumentException("Wrong selected operation");
        }
        return input;
    }

    private void showError(String message) {
        System.out.println("Error: " + message);
    }

}
