package schwarz.it.lws.calculator;

import java.util.Scanner;

public class CalculatorOperationsService implements CalculatorOperations {
    @Override
    public double add(Scanner scanner) {
        return 0;
    }

    @Override
    public double sub(Scanner scanner) {
        return 0;
    }

    @Override
    public double mul(Scanner scanner) {
        return 0;
    }

    @Override
    public double div(Scanner scanner) {
        return 0;
    }

    @Override
    public double percent(Scanner scanner) {
        return 0;
    }

    @Override
    public double square(Scanner scanner) {
        return 0;
    }

    @Override
    public long modulo(Scanner scanner) {
        return 0;
    }

    @Override
    public String inputWithPrompt(String prompt, Scanner scanner) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
