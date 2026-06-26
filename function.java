import java.util.*;

public class function {
    // public static void printMyname(String name){
    //     System.out.println(name);
    //     return;
    // }

    // public static int calculateSum(int a, int b) {
    //     int sum = a + b;
    //     return sum;
    //     }

    // public static int calculateMul(int a, int b)
    // {
    //     int mul = a * b;
    //     return mul;
    // }

    public static void findFact(int n) {
        if (n < 0) {
            System.out.println("Invalid Number");
            return;

        }
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;

    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {

            //String name = sc.next();
            //printMyname(name);
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // int sum = calculateSum(a, b);
            // System.out.println(sum);

            int n = sc.nextInt();

            // int mul = calculateMul(a, b);
            // System.err.println(mul);
            
            findFact(n);

        }
    }
}
