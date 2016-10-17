package com.johnwlong.hello;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.io.*;

public class HelloTest extends TestCase {
  public HelloTest( String testName ) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite(HelloTest.class);
  }

  private final ByteArrayOutputStream out = new ByteArrayOutputStream();
  private final ByteArrayOutputStream err = new ByteArrayOutputStream();

  public void setUp() {
    System.setOut(new PrintStream(out));
    System.setErr(new PrintStream(err));
  }

  public void tearDown() {
    System.setOut(null);
    System.setErr(null);
  }

  public void testPrintsHelloWorld() {
    String[] args = new String[] {};
    Hello.main(args);
    assertEquals("Hello world!\n", out.toString());
  }

  public void testPrintsHelloJohn() {
    String[] args = new String[] {"John"};
    Hello.main(args);
    assertEquals("Hello John!\n", out.toString());
  }

  public void testPrintsHelloJohnJacobJingleheimerSchmidt() {
    String[] args = new String[] {"John Jacob Jingleheimer Schmidt"};
    Hello.main(args);
    assertEquals("Hello John Jacob Jingleheimer Schmidt!\n", out.toString());
  }

  public void testErrorsGracefullyWithMoreThanOneParameter() {
    String[] args = new String[] {"a", "b", "c"};
    Hello.main(args);
    assertEquals("hello: too many parameters!\n", err.toString());
  }
}
