package javaNumberPrograms;

public class TechNumber {
    // 2025=20+25=45 ka square =2025 is a Tech Number
    public static void main(String[] args) {
        int number=2025;
        int cpy=number;
        int length=(int)Math.log10(number)+1;
        if (length%2==0){
            int secondHalf= (int) (number%Math.pow(10,length/2));
            number/=Math.pow(10,length/2);
            int firstHalf=number;
            int sum=firstHalf+secondHalf;
            if(cpy==(sum*sum)){
                System.out.println("The " +cpy+ " is Tech Number");
            }else{
                System.out.println("The " +cpy+ " is not a Tech Number");
            }
        }
    }


}
