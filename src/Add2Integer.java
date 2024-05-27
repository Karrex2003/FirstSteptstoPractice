import java.util.Scanner;

//Write a program called Add2Integers that prompts user to enter two integers. The program shall read the two integers as int; compute their sum; and print the result. For example,
public class Add2Integer {
    public static void main (String[] args){
        int number1, number2, sum;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.println("la suma de "+ number1 +" y " +number2+" es:" +sum);
    }
}
