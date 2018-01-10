package at.sheldor5.security.sha3;

import java.security.MessageDigest;

public abstract class Sha3MessageDigest extends MessageDigest {

  private static final int ROW_LENGTH = 5;
  private static final int COL_LENGTH = 5;
  private static final int L_MAX = 6;

  private int l;

  //
  // w = 2 ^ l
  private int w;

  // width
  // b = 25 x w
  private int b;


  /* Sponge Function */
  // bitrate
  private int r;

  // capacity
  // c = b?? - r
  private int c;

  // diversifier
  private  int d;

  private byte[][][] a;

  Sha3MessageDigest(String algorithm, int r, int c, int w) {
    super(algorithm);
    this.l = (int) (Math.log(w) / Math.log(2));
    if (l < 0 || l > L_MAX) {
      throw new IllegalArgumentException("l");
    }
    this.w = (int) Math.pow(2, l);
    this.b = COL_LENGTH * ROW_LENGTH * this.w;
    // l = (int) (Math.log(this.b/25.0D) / Math.log(2));
    a = new byte[COL_LENGTH][ROW_LENGTH][w];
  }

  @Override
  protected void engineUpdate(byte input) {

  }

  @Override
  protected void engineUpdate(byte[] input, int offset, int len) {

  }

  @Override
  protected byte[] engineDigest() {
    return new byte[0];
  }

  @Override
  protected void engineReset() {
    for (int x = 0; x < COL_LENGTH; x++) {
      for (int y = 0; y < ROW_LENGTH; y++) {
        for (int z = 0; z < w; z++) {
          a[x][y][z] = 0x0;
        }
      }
    }
  }

  /**
   * Keccak-p Permutations
   * @param b width (2 ^ l | l 0..6).
   * @param nr number of iterations (any positive integer).
   */
  private void p(int b, int nr) {

  }

  // θ
  private void theta() {
    byte[][] C = new byte[COL_LENGTH][w];
    for (int x = 0; x < COL_LENGTH; x++) {
      for (int z = 0; z < w; z++) {
        // C[x][z] = a[x][0][z] ^ a[x][1][z] ^ a[x][2][z] ^ a[x][3][z] ^ a[x][4][z];
      }
    }
  }

  public String stateString() {
    char[] c = new char[b];
    for (int x = 0; x < COL_LENGTH; x++) {
      for (int y = 0; y < ROW_LENGTH; y++) {
        for (int z = 0; z < w; z++) {
          c[x+y+z] = (char) a[x][y][z];
        }
      }
    }
    return new String(c);
  }
}
