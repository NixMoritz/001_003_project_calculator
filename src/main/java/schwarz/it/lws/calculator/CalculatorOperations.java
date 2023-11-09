package schwarz.it.lws.calculator;

import java.util.Scanner;

public interface CalculatorOperations {

    double add(Scanner scanner);

    double sub(Scanner scanner);

    double mul(Scanner scanner);

    double div(Scanner scanner);

    double percent(Scanner scanner);

    double square(Scanner scanner);

    long modulo(Scanner scanner);

    String inputWithPrompt(String prompt, Scanner scanner);
}
