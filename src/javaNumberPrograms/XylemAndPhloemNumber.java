package javaNumberPrograms;

public class XylemAndPhloemNumber {
    // sum of the first and last digit = sum of the middle digit is xylem
    //   != phloem
    public static void main(String[] args) {
        int number=12346;
        String temp=Integer.toString(number);
        int[] numbers=new int[temp.length()];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=temp.charAt(i)-'0';
        }
        int sum1=0;
        sum1=numbers[0]+numbers[numbers.length-1];
        int sum2=0;
        for(int i=1;i<numbers.length-1;i++){
            sum2+=numbers[i];
        }
        if(sum1==sum2){
            System.out.println("xylem");
        }else {
            System.out.println("Phloem");
        }
    }
}
