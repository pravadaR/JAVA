//import java.util.*;
public class Recursion1 {
    //5 to 1
    // public static void printNumb(int n)
    // {
    //     if (n == 0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n - 1);
    // }

    // public static void main(String args[])
    // {
    //     int n = 5;
    //     printNumb(n);
    // }

    //1 to 5
    // public static void printNumb(int n)
    // {
    //     if (n == 6) {
    //         return;
    //     }
    //     System.out.println(n);
    //     printNumb(n + 1);
    // }

    // public static void main(String args[])
    // {
    //     int n = 1;
    //     printNumb(n);
    // }

    //sum of first n natural numbers
    // public static void printSum(int i, int sum, int n)
    // {
    //     if (i == n) {
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += i;
    //     printSum(i + 1, sum, n);
    // }
    // public static void main(String args[])
    // {
    //     printSum(1, 0, 5);
    // }

    //factorial of a number n
    // public static int printFac(int n)
    // {
    //     if(n==1 || n==0)
    //     {
    //         return 1;
    //     }
    //     int fact_nm1=printFac(n-1);
    //     int fact_n=n*fact_nm1;
    //     return fact_n;
    // }
    // public static void main(String args[])
    // {
    //     int n = 3;
    //     int ans = printFac(n);
    //     System.out.println(ans);
    // }

    //fibonacci series
    //public static void printFib(int a, int b, int n)
    // {
    //     if(n==0)
    //     {
    //         return;
    //     }
    //     int c = a + b;
    //     System.out.println(c);
    //     printFib(b, c, n-1);  
    // }
    // public static void main(String args[])
    // {
    //     int a = 0, b = 1;
    //     System.out.println(a);
    //     System.out.println(b);
    //     int n = 7;
    //     printFib(a, b, n - 2);
    // }

    //print x^n (stack height=n)
    // public static int calPower(int x,int n)
    // {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     if (x == 0) {
    //         return 0;
    //     }
    //     int xPownm1 = calPower(x, n - 1);
    //     int xPown = x * xPownm1;
    //     return xPown;
    // }

    // public static void main(String args[])
    // {
    //     int x = 2, n = 5;
    //     int ans = calPower(x, n);
    //     System.out.println(ans);
    // }

    //print x^n (stack height=logn)
    public static int calPower1(int x,int n)
    {
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }
        //if n is even
        if (n % 2 == 0) {
            return calPower1(x, n/2) * calPower1(x, n/2);
        } else {
            return calPower1(x, n/2) * calPower1(x, n/2) * x;

        }
    }
    public static void main(String args[])
    {
        int x = 2, n = 5;
        int ans = calPower1(x, n);
        System.out.println(ans);
    }
}
