package javaConversionPrograms;

public class LongToString {
    /*
    Converting Long value to String
    1. String.valueOf(number)
    2. Long.toString(number)
     */
    public static void main(String[] args) {
        long number=10;
        System.out.println(String.valueOf(number)+1);
        System.out.println(Long.toString(number)+1);
    }
}
