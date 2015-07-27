package com.malu.rnd;

import java.util.Random;

/**
 * Created by malu on 6/30/15.
 */

class GuessGame {

  public void startGame() {

    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    int guess1 = 0;
    int guess2 = 0;
    int guess3 = 0;
    Random rand = new Random();
    int targetNum = rand.nextInt(10);
    boolean p1right = false;
    boolean p2right = false;
    boolean p3right = false;
    System.out.println("I am thinking of a number between 0 and 9...");
//        while (true) {
    System.out.println("Number to guess is:" + targetNum);
    p1.guess();
    p2.guess();
    p3.guess();
    if (p1.num == targetNum) {
      System.out.println("Player1 guessed:" + p1.num);
      p1right = true;
    }
    if (p2.num == targetNum) {
      System.out.println("Player2 guessed:" + p2.num);
      p2right = true;
    }
    if (p3.num == targetNum) {
      System.out.println("Player3 guessed:" + p3.num);
      p3right = true;
    }
//        }

    if (p1right && p2right && !p3right) {
      System.out.println("NO WINNERS");
    }
  }
}

class Player {

  int num = 0;

  public void guess() {
    Random rand = new Random();
    num = rand.nextInt(10);
    System.out.println("I am guessing " + num);
  }
}

public class GameLauncher {
  public static void main(String[] args) {
    GuessGame guess = new GuessGame();
    guess.startGame();
  }
}
