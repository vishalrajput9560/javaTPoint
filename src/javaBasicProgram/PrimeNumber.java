package javaBasicProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        System.out.println(isPrime(number));

    }

    public static boolean isPrime(int n){
        if(n==1)
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2==0 || n%3==0)
            return false;
        for(int i=5;i*i<n;i+=6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
}
