package javaNumberPrograms;

public class DuckNumber {
    // if the number contains 0 anywhere is the number except at the beginning
    public static void main(String[] args) {
        int number=1011;
        boolean isDuck=false;
        while (number>0){
            int lastDigit=number%10;
            if(lastDigit==0){
                isDuck=true;
                break;
            }
            number/=10;
        }
        System.out.println(isDuck);

    }


}
