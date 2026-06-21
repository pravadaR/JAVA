public class loop {
    
    public static void main(String args[])
    {
        for (int counter = 0; counter < 3; counter = counter + 1) {
            System.out.println("Hello world");
        }

        // for (int counter = 0; counter < 11; counter++) {
        //     System.out.println(counter + "");
        // }

        // for(int i = 0;i<11;i++)
        // {
        //     System.out.println(i);
        // }
        // 
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i=i+1;
        // } while (i < 11);
        int i = 12;
        while(i<11)
        {
            System.out.println(i);
            i=i+1;
        }
    }
}

//sum if first n natural numbers
//scanner sc = new scanner(System.in);
// int n = sc.nextInt();
// int sum = 0;
// for(int i = 1; i <= n; i++)
// {
//     sum = sum + i;
// }        
// System.out.println(sum);

//print the table of a number input by the user
//int n=sc.nextInt();
// for(int i = 1; i <= 10; i++)
// {
//     System.out.println(n + " * " + i + " = " + n*i);
// }    
