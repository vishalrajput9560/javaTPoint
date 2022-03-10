package javaNumberPrograms;

public class SunnyNumber {
    // if next Number is prime then Yes

    public static void main(String[] args) {
        int number = 39;

        double sqrt=Math.sqrt(number+1);
        if(sqrt-Math.floor(sqrt)==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
