package javaNumberPrograms;

public class SmithNumber {
    // number = 85
    // prime factor of 85= 5,17
    // 5+1+7=13 is a smith number
    public static void main(String[] args) {
        int number=668;
        int factor=primeFactor(number);
        int sumOfNumber=sumOfDigit(number);
        int total=sumOfDigit(factor);
        if(total==sumOfNumber){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static int primeFactor(int n){
        String primeResult="";
        String stringResult="";
        int result;
        if(n<=1) {
            return -1;
        }
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                primeResult=Integer.toString(i);
                n/=i;
            }
        }

        if(n>1){
            String primeResult2="";
            primeResult2=Integer.toString(n);
            stringResult=primeResult.concat(primeResult2);

        }
        result=Integer.parseInt(stringResult);

      return result;
    }
    public static int sumOfDigit(int number){
        int sum=0;
        primeFactor(number);
        while(number>0){
            int lastDigit=number%10;
            sum+=lastDigit;
            number/=10;
        }
    return sum;
    }
}
