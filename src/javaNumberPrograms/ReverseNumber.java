package javaNumberPrograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int number=1901;
        int rev=0;
        while(number>0){
            int lastDigit=number%10;
            rev=rev*10+lastDigit;
            number/=10;
        }
        System.out.println(rev);
    }
}
