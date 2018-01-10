package at.sheldor5.security;

import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;

public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello World!");
    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    Provider provider;
    Security.addProvider(null);
  }
}
