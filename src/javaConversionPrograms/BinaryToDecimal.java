package javaConversionPrograms;

public class BinaryToDecimal {
    /*
    Converting Binary To Decimal
    1. Use Integer.parseInt(num)
     */
    public static void main(String[] args) {
        String num="1010";
        int decimal=Integer.parseInt(num,2);
        System.out.println(decimal);
    }
}
