package javaNumberPrograms;

public class NumberToWord {
    // 1234 :- One Thousand two Hundred thirty-four
    // if you want to find the length of the String use:
    // String.valueOf(number).length;

    // if you want to find the value of integer use:
    // (int)(Math.log10(number)+1);


    public static void main(String[] args) {

        int number=134;
        int cpy=number;
        int lenght=(int)Math.log10(number)+1;
        int[] arr =new int[4];
        int i=0;
        while(number>0){
            arr[i]=number%10;
            number/=10;
            i++;
        }

        String oneDigit[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String multipleOfTen[]={"", " ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        String powOfTen[]={"","hundred","thousand"};

        if(cpy<20){

            System.out.println(oneDigit[arr[0]]);
        }
        if(lenght==2 && cpy>=20){
            System.out.println(multipleOfTen[arr[1]] + " " + oneDigit[arr[0]]);
        }
        if(cpy>=100){
            System.out.println(oneDigit[arr[2]]+" "+powOfTen[arr[2]] + " " + multipleOfTen[arr[1]] + " " + oneDigit[arr[0]]);
        }
    }
}

