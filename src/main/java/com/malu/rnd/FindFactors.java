package com.malu.rnd;

import java.util.Scanner;

/**
 * Created by malu on 6/25/15.
 */
public class FindFactors {

  public static void main(String[] args) {
    System.out.println("Enter a number:");
    Scanner scan = new Scanner(System.in);
    int input = scan.nextInt();
    System.out.println("Factors of " + input + " are:");
    for (int i = 1; i <= input; i++) {
      if (input % i == 0) {
        System.out.println(i);
      }
    }
    PrimeNumber prime = new PrimeNumber();
    System.out.println(prime.checkPrime);

  }

}
