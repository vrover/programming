/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WiproTraining;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Public
 */
public class DayOfTheWeek {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter=new SimpleDateFormat("dd/mm/yyyy");
        Date d=formatter.parse("02/04/2018");
        Calendar c=Calendar.getInstance();
        c.setTime(d);
        String day=c.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH);
        System.out.println(day);
    }
}
