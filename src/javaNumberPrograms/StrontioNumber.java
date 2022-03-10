package javaNumberPrograms;

public class StrontioNumber {
    // int number=1386   1386*2=2772 the middle digits are same so its a strontio Number

    public static void main(String[] args) {
        int number=1024*2;
        int length=(int)(Math.log10(number)+1);
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            int lastDigit=number%10;
            arr[i]=lastDigit;
            number/=10;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("True");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
