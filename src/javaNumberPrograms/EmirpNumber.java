package javaNumberPrograms;

public class EmirpNumber {
    //if the given Number is Prime and it's reverse it also prime then
    // its a Emirp Number

    public static void main(String[] args) {
        int number=19;
        int cpy=number;
        int rev=0;
        while(number>0){
            int lastDigit=number%10;
            rev=rev*10+lastDigit;
            number/=10;
        }
        if(isPrime(cpy) && isPrime(rev)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static boolean isPrime(int number){
        if(number==0 || number==1){
            return false;
        }
        if(number==2 || number==3){
            return true;
        }
        if(number%2==0 || number%3==0){
            return false;
        }
        for (int i=5;i*i<number;i+=6){
            if(number%i==0 || number%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
