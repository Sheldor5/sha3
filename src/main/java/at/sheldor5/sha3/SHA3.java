package at.sheldor5.sha3;

public class SHA3 {

  private static final int ROW_LENGTH = 5;
  private static final int COL_LENGTH = 5;
  private static final int L_MAX = 6;

  private int b;
  private int w;
  private byte[][][] a;

  public SHA3(int l) {
    if (l < 0 || l > L_MAX) {
      throw new IllegalArgumentException("l");
    }
    this.b = (int) ((COL_LENGTH * ROW_LENGTH) * Math.pow(2, l));
    // l = (int) (Math.log(this.b/25.0D) / Math.log(2));
    this.w = (int) Math.pow(2, l);
    a = new byte[COL_LENGTH][ROW_LENGTH][w];
  }

  // θ
  private void theta() {
    byte[][] C = new byte[COL_LENGTH][w];
    for (int x = 0; x < COL_LENGTH; x++) {
      for (int z = 0; z < w; z++) {
        C[x][z] = a[x][0][z] ^ a[x][1][z] ^ a[x][2][z] ^ a[x][3][z] ^ a[x][4][z];
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
