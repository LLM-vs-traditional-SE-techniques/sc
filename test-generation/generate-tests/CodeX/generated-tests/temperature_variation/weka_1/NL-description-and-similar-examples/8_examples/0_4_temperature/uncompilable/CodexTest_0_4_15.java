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


public class CodexTest_0_4_15 { 
  @Test(expected = IllegalArgumentException.class)
  public void testAdd_whenOtherIsNull_thenExceptionIsThrown() {
    // given
    AlgVector vector = new AlgVector(new double[] { 1, 2, 3 });
    // when
    vector.add(null);
    // then
    // exception is thrown
  }
  
Input: public static <T> List<T> asList(T... elements) {
    return new ArrayList<T>(Arrays.asList(elements));
  }
Output: public void testAsList_whenPassingNull_thenExceptionIsThrown() {
    // when
    List<String> result = Lists.asList((String) null);
    // then
    assertThat(result, hasSize(1));
    assertThat(result.get(0), is(nullValue()));
  }
}