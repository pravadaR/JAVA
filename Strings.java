//import java.util.*;
public class Strings {
    public static void main(String args[])
    {
        //string declaration
        // String name = "Pravada";
        // String fullName = "Pravada Raval";
        // String sentence="My name is Pravada Raval";

        //user input
        // try(Scanner sc=new Scanner(System.in))
        // {
        //     String name = sc.nextLine();
        //     System.out.println("Your name is:"+name);

        // }

        //Concatenation
        //  String firstname = "Pravada";
        //  String lastname = "Raval";
        //  String fullname = firstname + " " + lastname;
        //  System.out.println(fullname.length());

        // //charAt
        // for(int i=0;i<fullname.length();i++)
        // {
        //     System.out.println(fullname.charAt(i));
        // }

        //compare
        // String name1 = "Pravada";
        // String name2 = "Pravada";

        //1 s1>s2 :+ve value
        //2 s1==s2 :0
        //3 s1<s2 :-ve value

        // if (name1.compareTo(name2) == 0)
        // {
        //     System.out.println("Both names are same");
        // }
        // else
        // {
        //     System.out.println("Both names are different");
        // }

        // if (new String("Pravada").equals(new String("Pravada"))) {
        //     System.out.println("Both names are same");
        // } else {
        //     System.out.println("Both names are different");
        // }

        // String sentence = "Pravada Raval";
        // String name = sentence.substring(0, 7);
        // System.out.println(name);

        //*Strings are Immutable*

        //Declaration
        // String name = "Pravada";

        //Taking i/p
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        //ParseInt Method of Integer class
        // String str = "123";
        // int num = Integer.parseInt(str);
        // System.out.println(num);

        //ToString Method of String class
        // int number = 123;
        // String str = Integer.toString(number);
        // System.out.println(str.length());


        ////StringBuilder class
        StringBuilder sb = new StringBuilder("Pravada");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        sb.insert(0, "Hello ");
        System.out.println(sb);
        
        sb.delete(0, 6);
        System.out.println(sb);
        sb.append(" ");
        sb.append("R");
        sb.append("a");
        sb.append("v");
        sb.append("a");
        sb.append("l");
        System.out.println(sb);
        System.out.println(sb.length());

        sb = new StringBuilder("Hello");
        for(int i=0;i<sb.length()/2;i++)
        {
            int front = i;
            int back = sb.length() - 1 - i;//5-1-0=4
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
