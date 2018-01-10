package at.sheldor5.security.sha3;

public class State {

  private int width;
  private int height;
  private int depth;

  private byte[][][] array;

  public State(int width, int height, int depth) {
    if (width < 0 || height < 0 || depth < 0) {
      throw  new IllegalArgumentException();
    }
    this.width = width;
    this.height = height;
    this.depth = depth;
    array = new byte[width][height][depth];
  }

  public byte get(int x, int y, int z) {
    if (outOfBounds(x, y, z)) {
      throw  new IndexOutOfBoundsException();
    }
    return array[x][y][z];
  }

  public void set(int x, int y, int z, byte value) {
    if (outOfBounds(x, y, z)) {
      throw  new IndexOutOfBoundsException();
    }
    array[x][y][z] = value;
  }

  private boolean outOfBounds(int x, int y, int z) {
    return x < 0 || y < 0 || z < 0 || x >= width || y >= height || z >= depth;
  }
}
