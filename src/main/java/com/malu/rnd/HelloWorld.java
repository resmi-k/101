package com.malu.rnd;


/**
 * Created by malu on 6/24/15.
 */

class Animal {

  boolean isAPet;

  public boolean getIsAPet() {
    return isAPet;
  }

}

class Dog extends Animal {
  //boolean isAPet = true;
  public boolean getIsAPet() { //overriding the method getIsAPet()
    return isAPet;
  }
}

class Tiger extends PrimeNumber {

  boolean isAPet = false;
   /* public boolean getIsAPet() { //overriding the method getIsAPet()
        return isAPet;
    }*/

}

public class HelloWorld {
  public static void main(String[] args) {
    //System.out.println("Hello World");
    Dog dog = new Dog();
    // System.out.print(dog.getIsAPet());

       /* PrimeNumber prime = new PrimeNumber();
        System.out.println(prime.checkPrime);*/  //ERROR cannot access checkPrime since protected


    String str = "knowledge";
    String s = str;
    System.out.println(str);
    System.out.println(s);
    str = str.concat("base");
    System.out.println(str);
  }
}
