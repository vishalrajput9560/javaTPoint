package javaNumberPrograms;

public class LargestOfThree {
    // temp=a>b?a:b;
    //largest=c>temp?c:temp;

    public static void main(String[] args) {
        int a=40;
        int b=20;
        int c=30;
        int largest=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int lTemp=a>b?a:b;
        largest=c>lTemp?c:lTemp;
        System.out.println(largest);

        int sTemp=a<b?a:b;
        min=c<sTemp?c:sTemp;
        System.out.println(min);


    }
}
