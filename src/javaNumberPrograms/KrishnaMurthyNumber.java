package javaNumberPrograms;

public class KrishnaMurthyNumber {
    // number=145   1!+4!+5!=145  is a krishnamurthy Number
    public static void main(String[] args) {
        int number=145;
        int cpy=number;
        int sum=0;
        while (number>0){
            int lastDigit=number%10;
            sum+=factorial(lastDigit);
            number/=10;
        }
        if(sum==cpy){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
    public static int factorial(int number){
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;
    }
}
