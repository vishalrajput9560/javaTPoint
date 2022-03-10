package javaNumberPrograms;

public class SpyNumber {
    // if sum and product of the number is same

    public static void main(String[] args) {
        int number=111;
        int sum=0;
        int product=1;
        while(number>0){
            int lastDigit=number%10;
            sum+=lastDigit;
            product*=lastDigit;
            number/=10;
        }
        if(sum==product){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
