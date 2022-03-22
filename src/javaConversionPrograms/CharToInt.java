package javaConversionPrograms;

public class CharToInt {
    /* Converting Char to Int
        Gives the ascii value of char
        if we want the numeric value then we have to use the Character.getNumericValue(num)
     */
    public static void main(String[] args) {
        char num='1';
        int number=(int)num;
        System.out.println(number);
        System.out.println(Character.getNumericValue(num));
    }
}
