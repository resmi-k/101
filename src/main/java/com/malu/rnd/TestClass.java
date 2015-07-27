package com.malu.rnd;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 7/16/15
 */
public class TestClass {
  public static void main(String[] args) throws ParseException {


    BigDecimal foo = BigDecimal.valueOf(5.327);
    BigDecimal bar = BigDecimal.valueOf(3L);
    foo = foo.setScale(2, RoundingMode.UP);
    bar = bar.setScale(2);
    // System.out.println(foo);
    // System.out.println(foo + "/" + bar + ":" + foo.divide(bar, RoundingMode.HALF_UP));
    String dates = "2011-01-18 06:35:20 ";
    SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Date date = simple.parse(dates);
    String pattern = " EEEE, dd MMM yyyy HH:mm:ss a";
    simple.applyPattern(pattern);
    System.out.println(simple.format(date));
        /*DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM);
        formatter.parse(dates);
        System.out.println(formatter.format(date));*/


  }
}
