package at.sheldor5.security.sha3;

/**
 * @author Michael Palata
 * @date 10.01.2018
 */
public class SHA3_512 extends Sha3MessageDigest {

  static final String ALGORITHM = "SHA3-512";
  private static final int r = 512;
  private static final int c = 1088;
  private static final int d = 64;

  public SHA3_512() {
    super(ALGORITHM, r, c, d);
  }
}
