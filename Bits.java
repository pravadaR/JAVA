public class Bits {
    public static void main(String args[])
    {
        //get bit
        int n = 5; //0101
        int pos = 2;
        int bitMask = 1 << pos;

        if((bitMask & n)==0)
        {
            System.out.println("Bit was zero");
        }
        else {
            System.out.println("Bit was one");
        }
        //set bit
        int n1 = 5; //0101
        int pos1 = 1;
        int bitMask1 = 1 << pos1;
        int newNumber = bitMask1 | n1;
        System.out.println(newNumber);

        //clear bit
        int n2 = 5; //0101
        int pos2 = 2;
        int bitMask2 = 1 << pos2;
        int notBitMask = ~(bitMask2);
        int newNumber2 = notBitMask & n2;
        System.out.println(newNumber2);

        //update bit
        int n3 = 5; //0101
        int pos3 = 1;
        int bitMask3 = 1 << pos3;
        int newNumber3 = bitMask3 | n3;
        System.out.println(newNumber3);
        //case 2
        int n4 = 5; //0101
        int pos4 = 2;
        int bitMask4 = 1 << pos4;
        int notBitMask4 = ~(bitMask4);
        int newNumber4 = notBitMask4 & n4;
        System.out.println(newNumber4);

    }
}
