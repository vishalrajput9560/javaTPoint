package javaNumberPrograms;

public class BuzzNumber {
    // A number that end with 7 or divisible by 7
    public static void main(String[] args) {
        int number=135;
        int lastDigit=number%10;
        if(number%7==0 || lastDigit==7){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

