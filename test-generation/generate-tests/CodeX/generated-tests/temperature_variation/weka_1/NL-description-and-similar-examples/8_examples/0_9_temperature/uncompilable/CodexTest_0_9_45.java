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


public class CodexTest_0_9_45 { 
  @Test
  /**
   * Inserts the specified element at the specified position in this vector.
   * Shifts the element currently at that position (if any) and any
   * subsequent elements to the right (adds one to their indices).
   *
   * @param index index at which the specified element is to be inserted.
   * @param element element to be inserted.
   * @throws ArrayIndexOutOfBoundsException if the index is out of range
   *         (<tt>index &lt; 0 || index &gt; size()</tt>).
   */
  public void add(int index, double element) {
    int s = size-1;
    if (index > s || index < 0)
      throw new ArrayIndexOutOfBoundsException(index + " >= 0 or "+ index + " < " + s);
    if (s+1 >= capacity)
      capacity = capacity << 1;
}