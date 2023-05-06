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


public class CodexTest_0_8_8 { 
  @Test
  public void testError() throws Exception {
    AlgVector v = new AlgVector(new double[] {0.0, 1.0});
    Instances model = new Instances(new StringReader("@relation test \n"
						     + "@attribute one numeric \n"
						     + "@attribute two numeric \n"
						     + "@attribute three {0, 1} \n"
						     + "@attribute four {0, 1} \n"
						     + "@data \n"
						     + "3, 4, 0, 0 \n"));
    try {
      v.getAsInstance(model, new Random(1));
    } catch (Exception e) {
      return;
    }
    fail("Should have raised an exception");
  }
}