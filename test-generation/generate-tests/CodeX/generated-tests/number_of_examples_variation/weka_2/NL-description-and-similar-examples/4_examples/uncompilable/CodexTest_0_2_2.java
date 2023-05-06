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


public class CodexTest_0_2_2 { 
  @Test
    public void testGetAsInstance() {
        try {
            AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
            Instances model = new Instances(new BufferedReader(new StringReader(
                    "@RELATION test\n"
                            + "@ATTRIBUTE a1 NUMERIC\n"
                            + "@ATTRIBUTE a2 NUMERIC\n"
                            + "@ATTRIBUTE a3 NUMERIC\n"
                            + "@DATA\n"
                            + "1.0,2.0,3.0\n"
                            + "4.0,5.0,6.0\n"
                            + "7.0,8.0,9.0\n"
            )));
            Instance inst = v.getAsInstance(model, new Random(1));
            assertEquals("a1", 1.0, inst.value(0), 1e-6);
            assertEquals("a2", 2.0, inst.value(1), 1e-6);
            assertEquals("a3", 3.0, inst.value(2), 1e-6);
        } catch (Exception ex) {
            fail("Exception: " + ex.getMessage());
        }
    }
}