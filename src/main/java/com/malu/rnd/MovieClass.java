package com.malu.rnd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by malu on 6/30/15.
 */


public class MovieClass {

  public static void main(String[] args) {
    int numStudents;
    int[] grades;
    System.out.println("Enter number of students:");
    Scanner inputScan = new Scanner(System.in);
    numStudents = inputScan.nextInt();
    grades = new int[numStudents];
    for (int i = 0; i < numStudents; i++) {
      System.out.println("Enter grade of student" + (i + 1));
      grades[i] = inputScan.nextInt();
    }
    System.out.println(Arrays.toString(grades));


  }
}