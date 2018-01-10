package at.sheldor5.security.sha3;

import java.security.Provider;
import java.security.Security;

/**
 * @author Michael Palata
 * @date 10.01.2018
 */
public class Sha3Provider extends Provider {

  private static final String NAME = "Keccak SHA-3";
  private static final double VERSION = 0.1D;
  private static final String INFO = "";
  private static Provider instance;

  /**
   * Constructs a SHA-3 provider.
   */
  private Sha3Provider() {
    super(NAME, VERSION, INFO);
    put("MessageDigest." + SHA3_512.ALGORITHM, SHA3_512.class.getCanonicalName());
    put("MessageDigest." + SHA3_256.ALGORITHM, SHA3_256.class.getCanonicalName());
  }

  public static void init() {
    if (instance == null) {
      Security.addProvider(instance = new Sha3Provider());
    }
  }
}
