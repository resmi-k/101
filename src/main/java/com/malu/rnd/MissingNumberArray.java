package com.malu.rnd;

import java.util.Arrays;

/**
 * 7/17/15
 */
public class MissingNumberArray {
  public static void main(String[] args) {
    int[] randomNumberArray = new int[10];
    int[] allNumbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 0; i < 10; i++) {
      randomNumberArray[i] = 1 + (int) (Math.random() * 10);
    }
    System.out.println("Random Number Array:" + Arrays.toString(randomNumberArray));
       /* Integer[] intArray = new Integer[] {1,2,3};
        System.out.println(Arrays.asList(intArray));*/
    System.out.println("Missing Numbers:");
      /*  for(int element : allNumbersArray) {
            boolean present = false;
            for(int j = 0; j < randomNumberArray.length ; j++){
                if(element == randomNumberArray[j]) {
                    present = true;
                    break;
                }
            }
            if (!present) {
                System.out.println(element);
            }
        }*/
    Arrays.sort(randomNumberArray);
    for (int element : allNumbersArray) {
      int index = Arrays.binarySearch(randomNumberArray, element);
      if (index < 0) {
        System.out.println(element);
      }
    }

  }
}
