package javaBasicProgram;

import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first Number");
        int n1=scanner.nextInt();
        System.out.println("Enter the second Number");
        int n2=scanner.nextInt();
        System.out.println("How many Number you want to display");
        int number=scanner.nextInt();

        if(number>2){
            System.out.print(n1 + " " + n2 + " ");
            int n3=0;
            while(number>=2){
                n3=n1+n2;
                System.out.print(n3 + " ");
                n1=n2;
                n2=n3;
                number--;
            }
        }
    }
}
