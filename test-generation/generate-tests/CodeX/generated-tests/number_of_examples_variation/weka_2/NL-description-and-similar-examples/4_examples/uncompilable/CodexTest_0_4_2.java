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


public class CodexTest_0_4_2 { 
  @Test
  public void testGetAsInstance() throws Exception {
    // given
    Instances data = new Instances(new BufferedReader(new StringReader(
        "@relation test\n" + "@attribute A numeric\n" + "@attribute B numeric\n"
            + "@attribute C numeric\n" + "@attribute D numeric\n"
            + "@data\n" + "1,2,3,4\n" + "5,6,7,8\n")));
    AlgVector v = new AlgVector(new double[] { 1.0, 2.0, 3.0, 4.0 });
    // when
    Instance result = v.getAsInstance(data, new Random(1));
    // then
    assertEquals(1.0, result.value(0), 0.0);
    assertEquals(2.0, result.value(1), 0.0);
    assertEquals(3.0, result.value(2), 0.0);
    assertEquals(4.0, result.value(3), 0.0);
  }
}