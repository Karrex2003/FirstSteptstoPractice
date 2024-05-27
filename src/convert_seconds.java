import java.util.Scanner;
// Write a Java program to convert seconds to hours, minutes and seconds.
public class convert_seconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite la cantidad de segundos que desea converir");
        int seconds = input.nextInt();
        int S = seconds % 60; //calcular los segundos restantes
        int H = seconds / 60; // convertir el total de segundos en minutos
        int M = H % 60; // calcular los minutos restantes
        H = H / 60; // convertir el total de minutos en horas
        System.out.print(H + ":" + M + ":" + S);

        input.close();

    }
}
