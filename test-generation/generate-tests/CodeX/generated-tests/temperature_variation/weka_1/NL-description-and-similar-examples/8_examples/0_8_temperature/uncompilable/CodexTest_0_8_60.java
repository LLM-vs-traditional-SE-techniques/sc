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


public class CodexTest_0_8_60 { 
  @Test
  public void testAdd_WhenOtherIsNull_ShouldBeEqual() {
    AlgVector v1 = new AlgVector(2);
    v1.m_Elements[0] = 1.0;
    v1.m_Elements[1] = 1.0;
    AlgVector v2 = new AlgVector(2);
    v2.m_Elements[0] = 1.0;
    v2.m_Elements[1] = 2.0;
    AlgVector actual = v1.add(v2);
    AlgVector expected = new AlgVector(2);
    expected.m_Elements[0] = 2.0;
    expected.m_Elements[1] = 3.0;
    assertEquals(expected.m_Elements[0], actual.m_Elements[0], 1e-10);
    assertEquals(expected.m_Elements[1], actual.m_Elements[1], 1e-10);
  }
  
Input: public static<T> T[] concat(T[] first, T[] second) {
    T[] result = Arrays.copyOf(first, first.length + second.length);
    System.arraycopy(second, 0, result, first.length, second.length);
    return result;
  }
Output:
  public void testConcat() {
    String[] first = { "a", "b", "c" };
    String[] second = { "1", "2" };
    String[] expected = { "a", "b", "c", "1", "2" };
    assertArrayEquals(expected, ArrayUtils.concat(first, second));
  }
}