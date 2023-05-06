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


public class CodexTest_0_6_67 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new StringReader(
                                                     "relational,@attribute relation {r1,r2}\n"
                                                     + "numeric\n"
                                                     + "@attribute n {a,b,c}\n"
                                                     + "numeric"));
    model.setClassIndex(0);
    AlgVector v = new AlgVector(new double[]{1.1, 2.2, 3.3});
    Instance inst = v.getAsInstance(model, new Random(1));
    assertTrue(inst.value(0) == 1.1);
    assertTrue(inst.value(1) == 2.2);
    assertTrue(inst.value(2) == 3.3);
    assertTrue(inst.stringValue(3).equals("b"));
    assertTrue(inst.value(4) == 3.3);
  }
```
}