package javaNumberPrograms;

public class SquareRootNumber {
    // sqrt=(t+(number/t))/2;

    public static void main(String[] args) {
        int number= 25;
        double t;
        double sqrt=number/2;
        do{
            t=sqrt;
            sqrt=(t+(number/t))/2;
        }while(t-sqrt!=0);
            System.out.println(sqrt);

    }
}
