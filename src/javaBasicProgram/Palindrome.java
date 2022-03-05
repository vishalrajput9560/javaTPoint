package javaBasicProgram;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int cpy=number;
        int rev=0;
        while(number!=0){
            int lastDigit=number%10;
            rev=rev*10+lastDigit;
            number/=10;
        }
        if(rev==cpy){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
