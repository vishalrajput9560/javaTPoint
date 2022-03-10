package javaNumberPrograms;

public class EvilAndOdiusNumber {
    // Evil= Even Number of 1's in binary representation of a number
    //Odius= Odd Number of 1's in binary representation of a number

    public static void main(String[] args) {
        int number=16;
        // convert integer to binary string
        String binary=Integer.toBinaryString(number);
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        if(count%2==0){
            System.out.println("The Number is a Evil Number");
        }else{
            System.out.println("The Number is Odius Number");
        }
    }
}
