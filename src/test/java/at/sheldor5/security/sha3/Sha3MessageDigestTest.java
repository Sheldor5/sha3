package at.sheldor5.security.sha3;

import org.junit.Assert;
import org.junit.Test;

import java.security.MessageDigest;

public class Sha3MessageDigestTest {

  @Test
  public void test() throws Exception {
    Sha3Provider.init();
    MessageDigest sha3_256 = MessageDigest.getInstance("SHA3-256");
    MessageDigest sha3_512 = MessageDigest.getInstance("SHA3-512");
    Assert.assertNotNull(sha3_256);
    Assert.assertNotNull(sha3_512);
    System.out.println(sha3_256);
    System.out.println(sha3_512);
  }
}
