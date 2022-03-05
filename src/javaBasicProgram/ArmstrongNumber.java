package javaBasicProgram;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
//        3: 3^1 = 3
//
//        153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
//
//        125: 1^3 + 2^3 + 5^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
//
//        1634: 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643

        System.out.println("Enter a Number");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int cpy=number;

        int length=(int)(Math.log10(number) + 1);
        int sum=0;

        while (number>0){
           int lastDigit=number%10;
           sum+=Math.pow(lastDigit,length);
           number/=10;
        }
        if(sum==cpy){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
