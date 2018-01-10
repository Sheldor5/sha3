package at.sheldor5.security.sha3;

/**
 * @author Michael Palata
 * @date 10.01.2018
 */
public class SHA3_256 extends Sha3MessageDigest {

  static final String ALGORITHM = "SHA3-256";
  private static final int r = 256;
  private static final int c = 576;
  private static final int d = 32;

  public SHA3_256() {
    super(ALGORITHM, r, c, d);
  }
}
