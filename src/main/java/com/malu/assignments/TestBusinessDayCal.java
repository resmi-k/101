package com.malu.assignments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * 7/21/15
 */
class BusinessDateCalculator {
  public void addBusinessDays(Date inputDate, int daysToAdd) {
    Calendar inputCalendar = Calendar.getInstance();
    inputCalendar.setTime(inputDate);
    if (daysToAdd >= 0) {
      for (int i = 0; i < daysToAdd; i++) {
        inputCalendar.add(Calendar.DATE, 1);
        if ((inputCalendar.get(Calendar.DAY_OF_WEEK)) == Calendar.SATURDAY || (inputCalendar.get(Calendar.DAY_OF_WEEK)) == Calendar.SUNDAY) {
          i--;
        }
      }

    } else {
      for (int i = daysToAdd; i < 0; i++) {
        inputCalendar.add(Calendar.DATE, -1);
        if ((inputCalendar.get(Calendar.DAY_OF_WEEK)) == Calendar.SATURDAY || (inputCalendar.get(Calendar.DAY_OF_WEEK)) == Calendar.SUNDAY) {
          i--;
        }
      }
    }
    System.out.println("Next business day is: " + inputCalendar.getTime());
  }

  public int calculateBusinessDays(Date startDate, Date endDate) {
    int workDays = -1;
    Calendar startCalendar = Calendar.getInstance();
    Calendar endCalendar = Calendar.getInstance();
    startCalendar.setTime(startDate);
    endCalendar.setTime(endDate);
    startCalendar.add(Calendar.DAY_OF_MONTH, 1);
    if (startCalendar.after(endCalendar)) {
      return workDays;
    }
    workDays++;
    while (startCalendar.before(endCalendar)) {
      int dayOfWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
      if ((dayOfWeek != Calendar.SUNDAY) && (dayOfWeek != Calendar.SATURDAY)) {
        workDays++;
      }
      startCalendar.add(Calendar.DAY_OF_MONTH, 1);
    }
    return workDays;
  }

  public void printBeautifulDate() throws ParseException {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a date(mm/dd/yyyy) : ");
    SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
    Date userInputDate = dateFormatter.parse(input.nextLine());
    String datePattern = "EEEE, dd MMM yyyy HH:mm:ss a";
    dateFormatter.applyPattern(datePattern);
    System.out.println("Beautiful Date: " + dateFormatter.format(userInputDate));
  }
}

public class TestBusinessDayCal {

  public static void testCalculateBusinessDays() throws ParseException {
    System.out.println("--------See the no: of business days in between your dates--------");
    BusinessDateCalculator dateCalculator = new BusinessDateCalculator();
    Scanner input = new Scanner(System.in);
    String datePattern = "E,MMM dd yyyy";
    System.out.println("Enter start date (mm/dd/yyyy):");
    SimpleDateFormat startDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    Date inputStartDate = startDateFormat.parse(input.nextLine());
    startDateFormat.applyPattern(datePattern);
    System.out.println("Enter end date (mm/dd/yyyy):");
    SimpleDateFormat endDateFormat = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
    Date inputEndDate = endDateFormat.parse(input.nextLine());
    endDateFormat.applyPattern(datePattern);
    int workDays = dateCalculator.calculateBusinessDays(inputStartDate, inputEndDate);
    if (workDays >= 0) {
      System.out.println("Number of business days between " + startDateFormat.format(inputStartDate) + " and " + endDateFormat.format(inputEndDate));
      System.out.println(workDays);
    } else {
      System.out.println("Start date should be before End date!!!!");
    }
  }

  public static void testAddBusinessDays() throws ParseException {
    System.out.println("-------------See the next business day---------------------");
    BusinessDateCalculator dateCalculator = new BusinessDateCalculator();
    System.out.println("Enter a date (mm/dd/yyyy): ");
    Scanner input = new Scanner(System.in);
    SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
    Date inputDate = dateFormatter.parse(input.nextLine());
    System.out.println("Enter number of days to add: ");
    int daysCount = input.nextInt();
    dateCalculator.addBusinessDays(inputDate, daysCount);
  }

  public static void testPrintBeautifulDate() throws ParseException {
    System.out.println("--------See your date in a beautiful format-------");
    BusinessDateCalculator dateCalculator = new BusinessDateCalculator();
    dateCalculator.printBeautifulDate();
  }

  public static void main(String[] args) throws ParseException {
    testCalculateBusinessDays();
    testAddBusinessDays();
    testPrintBeautifulDate();
  }
}
