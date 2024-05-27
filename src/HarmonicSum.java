public class HarmonicSum {
    public static void main (String[] args) {
        int N = 50000;
        double sumL2R = 0.0;         // Sum from left-to-right
        double sumR2L = 0.0;         // Sum from right-to-left
        double absDiff;              // Absolute difference between the two sums

        for (int denominator = 1; denominator <= N; ++denominator){
            sumL2R += 1.0 / denominator;
        }
        for (int denominator = N; denominator >= 1; denominator--) {
            sumR2L += 1.0 / denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R+ " \nthe sum from right-to left is: " +sumR2L);

        if (sumR2L == sumL2R){
            System.out.println("the sums are equals");
        }else{
            absDiff =  sumL2R - sumR2L;
            System.out.println("the difference is: " + absDiff);
        }
    }
}
