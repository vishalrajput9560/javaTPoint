package javaBasicProgram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the Number which Factorial you want..");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int fact=1;
        for(int i=number; i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
