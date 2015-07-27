package com.malu.assignments;

import java.util.Calendar;
import java.util.Locale;

/**
 * 7/21/15
 */
public class TestCalendar {
  public static void main(String[] args) {
    int startYear = 2016;
    int month = 6;
    int day = 4;
    for (int i = 0; i <= 10; i++) {
      Calendar calendar = Calendar.getInstance();
      calendar.set(startYear, month, day);
      int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
      String dayName = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US);
      if ((dayOfWeek == Calendar.SATURDAY) || (dayOfWeek == Calendar.SUNDAY)) {
        System.out.println(startYear + ": " + dayName + "**");

      } else {
        System.out.println(startYear + ": " + dayName);
      }
      startYear++;
    }
  }
}
