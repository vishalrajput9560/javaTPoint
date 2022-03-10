package javaNumberPrograms;

public class FascinatingNumber {
    /*
    number=327
    number*2=654
    number*3=981

    327654981 is having all the digit form 1-9, so it is a fascinating number
     */
    public static void main(String[] args) {
       int number=237;
       String conCatStr=Integer.toString(number)+Integer.toString(number*2)+Integer.toString(number*3);
       boolean found=true;
       for(char c = '1'; c <= '9'; c++)
        {
            int count = 0;

            for(int i = 0; i < conCatStr.length(); i++)
            {
                char ch = conCatStr.charAt(i);

                if(ch == c)
                    count++;
            }

            if(count > 1 || count == 0)
            {
                found = false;
                break;
            }
        }
        if(found)
            System.out.println(number + " is a fascinating number.");
        else
            System.out.println(number + " is not a fascinating number.");
    }
}


