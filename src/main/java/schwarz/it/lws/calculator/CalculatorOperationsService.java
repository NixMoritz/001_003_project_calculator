package schwarz.it.lws.calculator;

import java.util.Scanner;

public class CalculatorOperationsService implements CalculatorOperations {
    @Override
    public double add(Scanner scanner) {

        double number1 = Double.parseDouble(inputWithPrompt("Enter the first number you want to add: ", scanner));
        double additor = Double.parseDouble(inputWithPrompt("Enter the number from which you want to subtract: ", scanner));

        return number1 + additor;
    }

    @Override
    public double sub(Scanner scanner) {

        double minuend = Double.parseDouble(inputWithPrompt("Enter the number from which you want to subtract: ", scanner));
        double subtrahend = Double.parseDouble(inputWithPrompt("Enter the number you want to subtract: ", scanner));

        return minuend - subtrahend;
    }

    @Override
    public double mul(Scanner scanner) {

        double factor1 = Double.parseDouble(inputWithPrompt("Enter the number you want to multiply on: ", scanner));
        double factor2 = Double.parseDouble(inputWithPrompt("Enter the number you want to multiply by: ", scanner));

        return factor1 * factor2;
    }

    @Override
    public double div(Scanner scanner) {

        double divident = Double.parseDouble(inputWithPrompt("Enter the number you want to divide: ", scanner));
        double divisor = Double.parseDouble(inputWithPrompt("Enter the number you want to divide by: ", scanner));

        if (divisor != 0){
            return divident / divisor;
        }

        throw new IllegalArgumentException("Do not divide by Zero - Dummy ");

    }

    @Override
    public double percent(Scanner scanner) {

        double number1 = Double.parseDouble(inputWithPrompt("Enter the number you want to calculate a percentage of: ", scanner));
        double percentage = Double.parseDouble(inputWithPrompt("Enter the percentage you want to calculate: ", scanner));

        return (number1 * percentage) / 100.0;
    }

    @Override
    public double square(Scanner scanner) {

        double numberToSquare = Double.parseDouble(inputWithPrompt("Enter the number you want to square: ", scanner));

        return numberToSquare * numberToSquare;
    }

    @Override
    public long modulo(Scanner scanner) {

        long number1 = Long.parseLong(inputWithPrompt("Enter the number you want to use modulo on: ", scanner));
        long number2 = Long.parseLong(inputWithPrompt("Enter the modulo number you'd like to use: ", scanner));

        return number1 % number2;
    }

    @Override
    public String inputWithPrompt(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
