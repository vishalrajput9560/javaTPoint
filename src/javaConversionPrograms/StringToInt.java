package javaConversionPrograms;

public class StringToInt {
    /* Converting String to Integer

    1.  Integer.parseInt(number))
    2. Integer.valueOf(number))

     */

    public static void main(String[] args) {
        String number="30";
        System.out.println(Integer.parseInt(number)+1);
        System.out.println(Integer.valueOf(number)+1);
    }
}
