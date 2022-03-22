package javaConversionPrograms;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String date="19/04/1999";
        Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        System.out.println(date + "\t" + d1);
    }
}
