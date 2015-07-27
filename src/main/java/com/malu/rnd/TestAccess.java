package com.malu.rnd;

/**
 * Created by malu on 7/2/15.
 */

class SecondClass extends MyClass {

  public void showProtectedNum() {

    System.out.println("Protected Num :" + proNum);
  }

}

public class TestAccess {
  public static void main(String[] args) {

    SecondClass secondClass = new SecondClass();
    secondClass.showProtectedNum();

  }
}
