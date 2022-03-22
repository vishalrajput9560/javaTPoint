package javaConversionPrograms;

public class StringToLong {
    /*
    Converting String to Long
    1.Long.parseLong(number))
    2.Long.valueOf(number))
     */
    public static void main(String[] args) {
        String number="10";
        System.out.println(Long.parseLong(number)+1);
        System.out.println(Long.valueOf(number)+1);
    }
}
