package at.sheldor5.security.sha3;

import java.security.MessageDigest;

/**
 * @author Michael Palata
 * @date 10.01.2018
 */
abstract class SHA3 extends MessageDigest {
  /**
   * Creates a message digest with the specified algorithm name.
   *
   * @param algorithm the standard name of the digest algorithm.
   *                  See the MessageDigest section in the <a href=
   *                  "{@docRoot}/../technotes/guides/security/StandardNames.html#MessageDigest">
   *                  Java Cryptography Architecture Standard Algorithm Name Documentation</a>
   *                  for information about standard algorithm names.
   */
  protected SHA3(String algorithm) {
    super(algorithm);
  }
}
