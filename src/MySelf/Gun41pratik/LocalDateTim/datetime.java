package MySelf.Gun41pratik.LocalDateTim;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class datetime {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());


        System.out.println("dt = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("dt = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
    }
}
