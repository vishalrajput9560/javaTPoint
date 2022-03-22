package javaConversionPrograms;

public class OctalToDecimal {
    /*
    Converting Octal To Decimal
    1.Integer.parseInt(oct,8);
     */
    public static void main(String[] args) {
        String oct="10001";
        System.out.println(Integer.parseInt(oct,8));
    }
}
