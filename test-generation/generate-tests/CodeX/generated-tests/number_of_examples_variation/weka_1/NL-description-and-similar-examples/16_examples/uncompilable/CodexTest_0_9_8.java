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


public class CodexTest_0_9_8 { 
  public static <T> AlgVector<T> sum(AlgVector<T> a, AlgVector<T> b) {
    return a.add(b);
  }
  @Test(expected = ArrayIndexOutOfBoundsException.class)
  public void testSum() {
    AlgVector<Integer> a = new AlgVector<>();
    AlgVector<Integer> b = new AlgVector<>();
    AlgVector<Integer> sum = sum(a, b);
    assertEquals(a.getElement(a.numElements() - 1), sum.getElement(sum.numElements() - 1));
  }
}