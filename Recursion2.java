//import java.util.HashSet;

public class Recursion2 {
    //tower of hanoi
    // public static void towerOfHanoi(int n, String src, String helper, String dest)
    // {
    //     if (n == 1)
    //     {
    //         System.err.println("transfer disk" + n + "from" + src + "to" + dest);
    //         return;
    //     }
    //     towerOfHanoi(n - 1, src, dest, helper);
    //     System.out.println("transfer disk" + n + "from" + src + "to" + dest);
    //     towerOfHanoi(n - 1, helper, src, dest);

    // }

    // public static void main(String args[])
    // {
    //     int n = 3;
    //     towerOfHanoi(n, "S", "H", "D");
    // }
    // public static void printRev(String str, int idx)
    // {
    //     if (idx == 0) {
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.print(str.charAt(idx));
    //     printRev(str, idx - 1);
    // }
    // public static void main(String args[])
    // {
    //     String str = "abcd";
    //     printRev(str, str.length() - 1);
    // }

    //1st and last occurance
    // public static int first = -1;
    // public static int last = -1;

    // public static void findOccurance(String str, int idx, char element)
    // {
    //     if(idx==str.length())
    //     {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char currChar =str.charAt(idx);
    //     if(currChar==element)
    //     {
    //         if (first == -1) {
    //             first = idx;
    //         } else {
    //             last = idx;
    //         }
    //     }
    //     findOccurance(str, idx + 1, element);
    // }

    // public static void main(String args[])
    // {
    //     String str = "abaacdaefaah";
    //     findOccurance(str,0,'a');
    // }

    //array is sorted(strictly increasing)
    // public static boolean isSorted(int arr[], int idx)
    // {
    //     if (idx == arr.length - 1) {
    //         return true;
    //     }
    //     //if (arr[idx] < arr[idx + 1]) 
    //     if (arr[idx] >= arr[idx + 1]) {
    //         return false;
    //     }
    //     //else {
    //     //return false;
    //     //}
    //     return isSorted(arr, idx + 1);
    // }

    // public static void main(String args[])
    // {
    //     int arr[] = { 1, 3, 3 };
    //     System.out.println(isSorted(arr, 0));
    // }

    // public static void moveAllX(String str, int idx,int count, String newString)
    // {
    //     if (idx == str.length()) {
    //         for (int i = 0; i < count; i++)
    //         {
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if (currChar == 'X') {
    //         count++;
    //         moveAllX(str, idx + 1, count, newString);
    //     } else {
    //         newString += currChar;//newString=newString+currChar
    //         moveAllX(str, idx + 1, count, newString);
    //     }
    // }
    // public static void main(String args[])
    // {
    //     String str = "axbcxxd";
    //     moveAllX(str, 0, 0, "");
    // }

    //remove duplicates in a string
    // public static boolean[] map = new boolean[26];

    // public static void removeDuplicates(String str, int idx, String newString) {
    //     if (idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if (map[currChar - 'a']) {
    //         removeDuplicates(str, idx + 1, newString);
    //     } else {
    //         newString += currChar;
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str, idx + 1, newString);
    //     }
    // }
    // public static void main(String args[])
    // {
    //     String str = "abbccda";
    //     removeDuplicates(str, 0, "");
    // }

    //print all the subsequences of a string
    // public static void subsequece(String str, int idx, String newString)
    // {
    //     if (idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     //to be
    //     subsequece(str, idx + 1, newString + currChar);

    //     //or not to be

    //     subsequece(str, idx + 1, newString);
    // }
    // public static void main(String args[])
    // {
    //     String str = "abc";
    //     subsequece(str, 0, "");
    // }

    //print all the unique subsequence of a string
    // public static void subsequece(String str, int idx, String newString, HashSet<String> set)
    //  {
    //      if (idx == str.length()) {
    //          System.out.println(newString);
    //          return;
    //      }
    //      System.out.println(newString);
    //      set.add(newString);
    //      char currChar = str.charAt(idx);
    //      //to be
    //     subsequece(str, idx + 1, newString + currChar, set);

    //      //or not to be

    //      subsequece(str, idx + 1, newString, set);
    //  }
    //  public static void main(String args[])
    //  {
    //      String str = "abc";
    //      HashSet<String> set = new HashSet<>();
    //      subsequece(str, 0, "", set);
    //  }

    //print keypad combination
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str, int idx, String combination)
    {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String args[])
    {
        String str = "";
        printComb(str, 0, "");
    }

}
