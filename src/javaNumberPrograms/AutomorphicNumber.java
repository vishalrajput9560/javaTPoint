package javaNumberPrograms;

public class AutomorphicNumber {
    /* 76
       76*76=5776
       having last digit as the number to this is a automorphic number
     */
    public static void main(String[] args) {
        int number=76;
        int lenght=(int)(Math.log10(number)+1);
        int square = number*number;
        if(square%Math.pow(10,lenght)==number){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
