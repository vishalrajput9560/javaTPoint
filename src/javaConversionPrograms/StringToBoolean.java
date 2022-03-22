package javaConversionPrograms;

public class StringToBoolean {
    /*
    String to Boolean Conversion
    1. Boolean.parseBoolean(s1)
    2. Boolean.valueOf(s2)
     */

    public static void main(String[] args) {
        String s1="true";
        String s2="false";
        String s3="True";
        boolean b1=Boolean.parseBoolean(s1);
        boolean b2=Boolean.parseBoolean(s2);
        boolean b3=Boolean.parseBoolean(s3);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
