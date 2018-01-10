package at.sheldor5.sha3;

import org.junit.Test;

public class SHA3Test {

  @Test
  public void test() {
    SHA3 sha3 = new SHA3(6);
    System.out.printf(sha3.stateString());
  }
}
