package javaConversionPrograms;

public class StringToFloat {
    /*
    Converting String to Float
    1. Float.parseFloat(number)
    2. Float.valueOf(number)
     */
    public static void main(String[] args) {
        String number="10.25";
        System.out.println(Float.parseFloat(number)+1);
        System.out.println(Float.valueOf(number)+1);
    }

}
