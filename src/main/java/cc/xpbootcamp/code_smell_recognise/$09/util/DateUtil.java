package cc.xpbootcamp.code_smell_recognise.$09.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static Date getDateAfter(Date date, int dayAfter) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, dayAfter);
        return calendar.getTime();
    }
}
