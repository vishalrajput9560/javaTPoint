package javaNumberPrograms;

public class AutobiographicalNumber {
    // if sum of the digit and length of the digit is same
    public static void main(String[] args) {
        int number=1112;
        int length=(int)Math.log10(number)+1;
        int sum=0;
        while(number>0){
            int lastDigit=number%10;
            sum+=lastDigit;
            number/=10;
        }
        if(length==sum){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
