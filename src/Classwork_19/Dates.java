package Classwork_19;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Dates {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = dateTimeFormatter.format(dateTime);
        System.out.println(formattedDate);

        Calendar calendar = new GregorianCalendar();
        Date dateNow = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        System.out.println(simpleDateFormat.format(dateNow));

        calendar.add(Calendar.DATE,22);
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone);
        System.out.println(timeZone.getDisplayName());
    }

}
