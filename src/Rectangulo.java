import java.util.Scanner;
//Write a Java program to print the area and perimeter of a rectangle.
public class Rectangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba el valor del primer lado del rectángulo: ");
        double lado1 = input.nextDouble();

        System.out.print("Escriba el valor del segundo lado del rectángulo: ");
        double lado2 = input.nextDouble();


        double perimetro = 2 * (lado1 + lado2);
        double area = lado1 * lado2;

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);

        input.close();
    }
}
