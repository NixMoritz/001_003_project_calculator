package schwarz.it.lws.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;
import java.util.Scanner;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorOperationsServiceTest {

    @Test
    void add() {
        String[] given = {
                "213\n34",
                "31231\n35234",
                "124\n54",
                "22\n5",
                "12\n2",
        };

        String[] expected = {
                "247",
                "66465",
                "178",
                "27",
                "14",
        };

        for (int i = 0; i < expected.length; i++) {

            Scanner scanner = new Scanner(given[i]);

            CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
            double result = calculatorOperationsService.add(scanner);

            assertThat(result).isEqualTo(Double.parseDouble(expected[i]));
        }
    }

    @Test void sub() {

        String[] given = {
                "213\n34",
                "31231\n35234",
                "124\n54",
                "22\n5",
                "12\n2",
        };

        String[] expected = {
                "179",
                "-4003",
                "70",
                "17",
                "10",
        };

        for (int i = 0; i < expected.length; i++) {

            Scanner scanner = new Scanner(given[i]);

            CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
            double result = calculatorOperationsService.sub(scanner);

            assertThat(result).isEqualTo(Double.parseDouble(expected[i]));
        }
    }

    @Test
    void mul() {
        String[] given = {
                "213\n34",
                "31231\n35234",
                "124\n54",
                "22\n5",
                "12\n2",
        };

        String[] expected = {
                "7242",
                "1100393054",
                "6696",
                "110",
                "24",
        };

        for (int i = 0; i < expected.length; i++) {

            Scanner scanner = new Scanner(given[i]);

            CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
            double result = calculatorOperationsService.mul(scanner);

            assertThat(result).isEqualTo(Double.parseDouble(expected[i]));
        }
    }

    @Test
    void div() {
        String[] given = {
                "213\n34",
                "31231\n35234",
                "124\n54",
                "22\n5",
                "12\n2",
        };

        String[] expected = {
                "6,26",
                "0,89",
                "2,3",
                "4,4",
                "6",
        };

        DecimalFormat df = new DecimalFormat("#.##");

        for (int i = 0; i < expected.length; i++) {

            Scanner scanner = new Scanner(given[i]);

            CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
            double result = calculatorOperationsService.div(scanner);

            String formattedResult = df.format(result);

            Assertions.assertThat(formattedResult).isEqualTo(expected[i]);
        }
    }

    @Test
    void percent() {
        String[] given = {
                "213\n34",
                "31231\n35234",
                "124\n54",
                "22\n5",
                "12\n2",
        };

        String[] expected = {
                "72.42",
                "11003930.54",
                "66.96",
                "1.1",
                "0.24",
        };

        for (int i = 0; i < expected.length; i++) {

            Scanner scanner = new Scanner(given[i]);

            CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
            double result = calculatorOperationsService.percent(scanner);

            assertThat(result).isEqualTo(Double.parseDouble(expected[i]));
        }
    }

    @Test
    void square() {
        String[] given = {
                "213",
                "31231",
                "124",
                "22",
                "12",
        };

        String[] expected = {
                "45369.0",
                "975375361.0",
                "15376.0",
                "484.0",
                "144.0",
        };

        for (int i = 0; i < expected.length; i++) {

            Scanner scanner = new Scanner(given[i]);

            CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
            double result = calculatorOperationsService.square(scanner);

            assertThat(result).isEqualTo(Double.parseDouble(expected[i]));
        }
    }

    @Test
    void modulo() {
        String[] given = {
                "213\n2",
                "31231\n7",
                "124\n5",
                "22\n3",
                "12\n7",
        };

        String[] expected = {
                "1.0",
                "4.0",
                "4.0",
                "1.0",
                "5.0",
        };

        for (int i = 0; i < expected.length; i++) {

            Scanner scanner = new Scanner(given[i]);

            CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
            long result = calculatorOperationsService.modulo(scanner);

            assertThat((double)result).isEqualTo(Double.parseDouble(expected[i]));
        }

    }

    @Test
    void inputWithPrompt() {
    }
}
