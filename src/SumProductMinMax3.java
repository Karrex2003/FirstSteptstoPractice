//Write a program called SumProductMinMax3 that prompts user for three integers. The program shall read the inputs as int; compute the sum, product, minimum and maximum of the three integers; and print the results
import java.util.Scanner;
public class SumProductMinMax3 {
    public static void main (String[] args) {
        int number1, number2, number3;  // The 3 input integers
        int sum, product, min, max;     // To compute these

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        number1 = input.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        number2 = input.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        product = number1 * number2 * number3;
        min = number1;
        max = number3;

        System.out.println("la suma de los numeros es: "+sum+ " \nel producto de los numeros es: " + product);

        if (min < number2 && min < number3){
            System.out.println("el numero menor es: " + min);
        }else if (number3 < number2){
            System.out.println("el numero menor es: " + number3);
        }else {
            System.out.println("el numero menor es: "+ number2);
        }

        if (max > number2 && max > number1){
            System.out.println("el numero mayor es: " + max);
        }else if (number1 > number2){
            System.out.println("el numero mayor es: " + number1);
        }else {
            System.out.println("el numero mayor es: "+ number2);
        }
    }
}
