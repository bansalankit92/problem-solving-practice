package util;

import java.util.Random;

public class Util {

  public static int getRandom(){
    Random rand = new Random();
    return rand.nextInt(100);
  }
}
