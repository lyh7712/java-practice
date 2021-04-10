package lyh7712.javapractice.chapter24;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateCalendarSample {

    public static void main(String args[]) {
        DateCalendarSample sample = new DateCalendarSample();
        sample.useCalender();
    }

    public void useCalender() {
        Calendar greCal = new GregorianCalendar();
        System.out.println(greCal);

        int year = greCal.get(Calendar.YEAR);
        int month = greCal.get(Calendar.MONTH);
        int date = greCal.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "/" + month + "/" + date);

        String monthKorea = greCal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.KOREA);
        String monthUS = greCal.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.US);

        System.out.println(monthKorea);
        System.out.println(monthUS);
    }
}
