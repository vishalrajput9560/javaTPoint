package javaNumberPrograms;

public class KeithNumber {
    /*
    742=7+4+2=13
    4+2+13=19
    2+13+19=34
     */
    public static void main(String[] args) {
        int number=742;
        int arr[]=new int[4];
        for(int i=arr.length-2;i>=0;i--){
            arr[i] = number%10;
            number/=10;
        }
        
        for(int i=0;i<10;i++) {
            arr[3] = arr[0] + arr[1] + arr[2];
            System.out.println(arr[3]);
            arr[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = arr[3];
        }

    }
}
