import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_81 { 
  @Test
  /**
   * Tests if two vectors are equal.
   *
   * @param msg		the message to display
   * @param expected	the expected vector
   * @param actual	the actual vector
   */
  static protected void assertEquals(String msg, SparseVector expected, SparseVector actual) {
    assertEquals(msg + " (length)", expected.numValues(), actual.numValues());
}