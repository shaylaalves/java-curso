import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s which price $ %.2f%n", product1, price1);
        System.out.printf("%s which price $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();
        System.out.printf("measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", measure);
        }
    }


    /*   Em um novo programa, inicie as seguintes variáveis:

String product1 = "Computer";

String product2 = "Office desk";

int age = 30;

int code = 5290;

char gender = 'F';

double price1 = 2100.0;

double price1 = 650.50;

double measure = 53.234567;
    */

/*  Em seguida, usando os valores de variáveis, produza a seguinte saída na tela do console:

Products:Computer, witch price is $ 2100,00

Office desk, wich price is $ 650,50

Record: 30 years old, code 5290 and gender: F

Meause with eight decimal places: 53, 23456700

Rouded (three decimal places) 53,235

Us decimal point: 53.235 */