package com.malu.assignments;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * 7/14/15
 */

class FileIO {

  String myString = "Malu Pennu";

  public void writeToFile() throws FileNotFoundException {
    PrintWriter out = null;
    try {
      out = new PrintWriter("foo.txt");
      int stringLength = myString.length();
      for (int i = 0; i < stringLength; i++) {
        out.write(myString, i, stringLength - i);
        out.println();
      }
    } finally {
      if (out != null) {
        out.close();
      }
    }
  }

  public void readFromFile() throws IOException {
    Scanner in = new Scanner(Paths.get("foo.txt"));
    boolean linesSkipped = false;

    while (in.hasNextLine()) {
      String currentString = in.nextLine();
      if (currentString.length() <= 3) {
        linesSkipped = true;
        break;
      } else if (currentString.contains("l")) {
        continue;
      } else {
        System.out.println(currentString);
      }
    }

    in.close();

    if (!linesSkipped) {
      System.out.println("All lines were read");
    }
  }
}

public class TestFileIO {

  public static void main(String[] args) throws IOException {
    FileIO myFile = new FileIO();
    myFile.writeToFile();
    myFile.readFromFile();
  }


}
