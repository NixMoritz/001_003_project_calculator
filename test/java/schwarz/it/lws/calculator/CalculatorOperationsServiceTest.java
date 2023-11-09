package schwarz.it.lws.calculator;

import org.junit.jupiter.api.Test;
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

        for (i = 0; i < expected.length; i++) {

        Scanner scanner = new Scanner(given[i]);

        CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
        double result = calculatorOperationsService.add(scanner);

        assertThat(expected[i]).equals(result);
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
            "-4.003",
            "70",
            "17",
            "10",
        };

        for (i = 0; i < expected.length; i++) {

        Scanner scanner = new Scanner(given[i]);

        CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
        double result = calculatorOperationsService.sub(scanner);

        assertThat(expected[i]).equals(result);
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

        for (i = 0; i < expected.length; i++) {

        Scanner scanner = new Scanner(given[i]);

        CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
        double result = calculatorOperationsService.mul(scanner);

        assertThat(expected[i]).equals(result);
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
            "6,26470588235294",
            "0,886388147811773",
            "2,2962962962963",
            "4,4",
            "6",
        };

        for (i = 0; i < expected.length; i++) {

        Scanner scanner = new Scanner(given[i]);

        CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
        double result = calculatorOperationsService.div(scanner);

        assertThat(expected[i]).equals(result);
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
            "72,42",
            "11003930,54",
            "66,96",
            "1,1",
            "0,24",
        };

        for (i = 0; i < expected.length; i++) {

        Scanner scanner = new Scanner(given[i]);

        CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
        double result = calculatorOperationsService.percent(scanner);
        
        assertThat(expected[i]).equals(result);
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
            "45369",
            "975375361",
            "15376",
            "484",
            "144",
        };

        for (i = 0; i < expected.length; i++) {

        Scanner scanner = new Scanner(given[i]);

        CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
        double result = calculatorOperationsService.square(scanner);
        
        assertThat(expected[i]).equals(result);
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
            "1",
            "975375361",
            "15376",
            "484",
            "144",
        };

        for (i = 0; i < expected.length; i++) {

        Scanner scanner = new Scanner(given[i]);

        CalculatorOperationsService calculatorOperationsService = new CalculatorOperationsService();
        double result = calculatorOperationsService.modulo(scanner);
        
        assertThat(expected[i]).equals(result);
        }

    }

    @Test
    void inputWithPrompt() {
    }
}