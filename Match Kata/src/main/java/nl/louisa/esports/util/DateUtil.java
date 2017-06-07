package nl.louisa.esports.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static Date stringToDate(String s) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(s);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String dateToString(Date date) {
            return new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
