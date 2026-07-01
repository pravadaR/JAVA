// import java.util.*;
// public class assi2 {
//     public static void main(String args[])
//     {
//         // try(Scanner sc= new Scanner(System.in))
//         // {
//         //     int a = sc.nextInt();
//         //     int b = sc.nextInt();
//         //     int c = sc.nextInt();
//         //     int avg;
//         //     avg = (a + b + c) / 3;
//         //     System.out.println("The average is "+avg);
//         // }

//     }
// }
// import java.util.*;

// public class assi2 {
// public static int sumOfOdd(int n)
// {
//     int sum = 0;
//     for(int i=0;i<=n;i++)
//     {
//         if(i%2!=0)
//         {
//             sum+=i;
//         }
//     }
//     return sum;
// }
// public static void main(String args[])
// {
//     try(Scanner sc=new Scanner(System.in))
//     {
//         int n = sc.nextInt();
//         int sum = sumOfOdd(n);
//         System.out.println("The sum of odd numbers is "+sum);
//     }
// }

// public static int gretNum(int a, int b)
// {
//     if(a>b)
//     {
//         return a;
//     }
//     else {
//         return b;
//     }
//     }
// public static void main(String args[])
// {
//     try(Scanner sc=new Scanner(System.in))
// {
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     //int max=sc.nextInt();
//     int result = gretNum(a,b);
//     System.out.println("The greater number is " + result);
// }
// }

// public static double radius(int r)
// {
//     double circumference = 2 * 3.14 * r;
//     return circumference;
// }
// public static void main(String args[])
// {
//     try(Scanner sc=new Scanner(System.in))
//     {
//         int r = sc.nextInt();
//         double result = radius(r);
//         System.out.println("The circumference is " + result);
//     }
// }

// public static int Age(int age)
// {
//     if(age>=18)
//     {
//         System.out.println("You are eligible to vote");
//     }
//     else
//     {
//         System.out.println("You are not eligible to vote");
//     }
//     return age;
// }
// public static void main(String args[])
// {
//     try(Scanner sc=new Scanner(System.in))
//     {
//         int age = sc.nextInt();
//         int result = Age(age);
//         System.out.println("Your age is " + result);
//     }
// }

//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//         do {
//             System.out.println("Infinite loop");
//         } while (true);
//     }
// }

// public static void main(String args[]) {
//     int positive = 0, negative = 0, zeros = 0;
//     System.out.println("Press 1 to continue & 0 to stop");
//     Scanner sc = new Scanner(System.in);
//     int input = sc.nextInt();

//     while (input == 1) {
//         System.out.println("Enter your number : ");
//         int number = sc.nextInt();
//         if (number > 0) {
//             positive++;
//         } else if (number < 0) {
//             negative++;
//         } else {
//             zeros++;
//         }

//         System.out.println("Press 1 to continue & 0 to stop");
//         input = sc.nextInt();
//     }

//     System.out.println("Positives : " + positive);
//     System.out.println("Negatives : " + negative);
//     System.out.println("Zeros : " + zeros);
// }
//}
// import java.util.*;

// public class assi2 {
//     public static int power(int x, int n) {
//         int result = 1;
//         for (int i = 0; i < n; i++) {
//             result=result*x;
//         }
//         return result;
//     }
//     public static void main(String args[]) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int x = sc.nextInt();
//             int n = sc.nextInt();
//             int result = power(x, n);
//             System.out.println("The result is " + result);
//         }
//     }
// }

import java.util.*;

public class assi2 {
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a);
            if (i < n - 1) {
                System.out.print(" ");
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            printFibonacci(n);
        }
    }
}
