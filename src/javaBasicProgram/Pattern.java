package javaBasicProgram;

public class Pattern {
    public static void main(String[] args) {
        // first Pattern

        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // Pattern two

        for(int i=6;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //Patter three
        for(int i=1;i<6;i++){
            for(int j=6;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=6;i>0;i--){
            for(int j=6;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern Four

        for(int i=1;i<6;i++){
            for(int j=6;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=6;i>0;i--){
            for(int j=6;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=6;i>0;i--){
            for(int j=1;j<6;j++){
                if(i==j) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
