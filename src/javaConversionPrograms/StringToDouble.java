package javaConversionPrograms;

public class StringToDouble {
    /*
    Converting String Value to Double
    1. Double.parseDouble(number)
    2. Double.valueOf(number)
     */
    public static void main(String[] args) {
        String number="10.25";
        System.out.println(Double.parseDouble(number)+1);
        System.out.println(Double.valueOf(number)+1);
    }
}
