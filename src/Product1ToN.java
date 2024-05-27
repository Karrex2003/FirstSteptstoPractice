//Write a program called Product1ToN to compute the product of integers from 1 to 10 (i.e., 1×2×3×...×10), as an int. Take note that It is the same as factorial of N.
public class Product1ToN {
    public static void main(String[] args) {
        int Product = 1;
        int N = 10;
        for (int i = 1; i <= N; i++){
            Product *= i;
        }
        System.out.println("El factorial de " + N + " es: " + Product);
    }
}
