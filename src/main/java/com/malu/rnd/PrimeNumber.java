package com.malu.rnd;

import java.util.Scanner;

/**
 * Created by malu on 6/24/15.
 */
public class PrimeNumber {
  protected boolean checkPrime;

  public static void main(String[] args) {

    System.out.println("Enter a number:");
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    boolean isNotPrime = false;
    for (int j = 2; j <= num / 2; j++) {
      isNotPrime = (num % j == 0);
      if (isNotPrime) {
        break;
      }
    }

    if (isNotPrime) {
      System.out.println("Not Prime");
    } else {
      System.out.println("Prime");
    }


  }
}
