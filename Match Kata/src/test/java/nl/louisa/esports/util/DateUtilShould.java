package nl.louisa.esports.util;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static nl.louisa.esports.util.DateUtil.stringToDate;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DateUtilShould {


    @Test public void
    convert_date_as_string_to_a_date() {
        assertThat(stringToDate("18/05/2017"), is(toDate(18,5,2017)));

    }

    @Test public void
    convert_date_to_string_in_format_dd_MM_yyyy() {
        assertThat(DateUtil.dateToString(toDate(19, 6, 2018)), is("19/06/2018"));

    }

    private Date toDate(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, 0, 0 ,0 );
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }
}