package javaNumberPrograms;

public class NeonNumber {
    // number=9   9*9=81   8+1=9 so it is a neon Number

    public static void main(String[] args) {
        int number=10;
        int square=number*number;
        int sum=0;
        while(square>0){
            int lastDigit=square%10;
            sum+=lastDigit;
            square/=10;
        }
        if(sum==number){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
