package javaNumberPrograms;

public class ISBNNumber {
    // number=8147852369
    // sum=(1*9)+(6*2)+(3*3)+(2*4)+(5*5)+(8*6)+(7*7)+(4*8)+(1*9)+(8*10)
    // 9+12+9+8+25+48+49+32+9+80=281   281/11=0 is a ISBN Number

    public static void main(String[] args) {
        long number= 8_147_852_369L;
        int sum=0;
        for(int i=1;i<11;i++){
            int lastDigit=(int)number%10;
            System.out.println(lastDigit);
            sum=sum+(lastDigit*i);
            number/=10;
        }
        if(sum%11==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
