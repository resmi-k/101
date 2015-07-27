package com.malu.rnd;

/**
 * Created by malu on 7/7/15.
 */

class Even {

  int[] evenNums = new int[5];
  String name = "Even";

  public void showNums() {
    for (int i = 0; i < 5; i++) {
      evenNums[i] = i;
      System.out.println(evenNums[i]);
    }
  }

}

public class MyArray {

  public static void main(String[] args) {

    String[] vowels = {"a", "e", "i", "o", "u"};
    String[] names = new String[5];
    names[0] = "Malu (f)";
    names[1] = "Chakku (m)";
    names[2] = "Mabu (m)";
    names[3] = "KK (m)";
    names[4] = "KiKi (f)";
    System.out.println("Females are :");
    for (int i = 0; i < names.length; i++) {
      char compare = names[i].charAt(names[i].length() - 2);
      if (compare == 'f') {
        System.out.println(names[i]);
      }

    }
  }
}
