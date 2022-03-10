package javaNumberPrograms;

public class PetersonNumber {
    /*
    145=1!+4!+5!=145 True
     */
    public static void main(String[] args) {
        int number=145;
        int cpy=number;
        int sum=0;
        while (number>0){
            int lastDigit=number%10;
            sum+=fact(lastDigit);
            number/=10;
        }
        if(sum==cpy){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static int fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
