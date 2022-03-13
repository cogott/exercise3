import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class simpleCalculator {
    public static void main(String[] args) throws IOException {

        float firstNumberCuba, secondNumberCuba, sum, subtraction, product, quotient;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The program calculates sum, difference, product and quotient for two numbers");
        System.out.println("Enter the first number and press Enter");
        firstNumberCuba = Float.parseFloat(br.readLine());
        System.out.println("Enter the second and press Enter");
        secondNumberCuba = Float.parseFloat(br.readLine());

        sum = firstNumberCuba + secondNumberCuba;
        subtraction = firstNumberCuba - secondNumberCuba;
        product = firstNumberCuba * secondNumberCuba;
        quotient = firstNumberCuba / secondNumberCuba;

        System.out.printf("You entered two numbers, first is: " + "%2.2f",firstNumberCuba);
        System.out.printf(" and the second number is:" + "%2.2f", secondNumberCuba);

        System.out.println();

        System.out.printf("Sum = " + "%2.2f,\n", + sum);
        System.out.printf("Difference =" + "%2.2f,\n", + subtraction);
        System.out.printf("Product = " + "%2.2f,\n", + product);
        System.out.printf("Quotient = " + "%2.2f, \n", + quotient);
    }
}
