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


public class CodexTest_0_7_4 { 
  @Test
  public void testObjectsEqual() {
    Integer[] ints = { 1, 2, 3, 4, 5 };
    Object[] intsWrapped = Arrays.stream(ints).boxed().toArray();
    assertThat(Arrays.asList(intsWrapped), equalTo(Arrays.asList(ints)));
  }
}