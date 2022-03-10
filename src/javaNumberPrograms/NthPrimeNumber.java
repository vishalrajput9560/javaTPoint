package javaNumberPrograms;

public class NthPrimeNumber {
    public static void main(String[] args) {
        int count=0;
        int n=25;
        int i=1;
        while(count!=n){
            i++;
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println(i);

    }
    public static boolean isPrime(int number){
        if(number==1 || number==0){
            return false;
        }
        if(number==2 || number==3){
            return true;
        }
        if(number%2==0 || number%3==0){
            return false;
        }
        for(int i=5;i*i<=number;i+=6){
            if(number%i==0 || number%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
