package javaConversionPrograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateToString {
    /* Converting date to String
       Create the instance of Date Class also use getTime()
       create date fomate

     */
    public static void main(String[] args) {
        Date date= Calendar.getInstance().getTime();
        DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
        String strDate=dateFormat.format(date);
        System.out.println(strDate);
    }
}
