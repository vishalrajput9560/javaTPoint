package javaNumberPrograms;

public class AlternatePrimeNumber {
    public static void main(String[] args) {
        int temp=2;
        for(int i=2;i<100;i++){
            if (isPrime(i))
            {
                if (temp % 2 == 0)
                    System.out.print(i + " ");
                temp ++;
            }
        }


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
