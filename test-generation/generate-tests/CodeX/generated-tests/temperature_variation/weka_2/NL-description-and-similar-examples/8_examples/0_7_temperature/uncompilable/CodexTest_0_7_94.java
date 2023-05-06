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


public class CodexTest_0_7_94 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new StringReader("@relation test\n" + "@attribute x1 numeric\n" + "@attribute x2 {a,b}\n" + "@attribute x3 numeric\n" + "@data\n" + "0.1,b,2.3\n" + "2.2,a,4.5\n" + "1.1,a,3.7"));
        model.setClassIndex(1);
        AlgVector vec = new AlgVector(2.2, 1.1, 4.5);
        Random random = new Random(1);
        try {
            Instance newInst = vec.getAsInstance(model, random);
            assertEquals("Datatypes are not compatible.", newInst.value(0), 2.2, 0.001);
            assertEquals("Datatypes are not compatible.", 1, (int) newInst.value(1));
            assertEquals("Datatypes are not compatible.", newInst.value(2), 4.5, 0.001);
        } catch (Exception ex) {
            fail("Should not raise any exception!");
        }
        vec = new AlgVector(1.1, 4.5);
        random = new Random(1);
        try {
            vec.getAsInstance(model, random);
            fail("Should raise an exception!");
        } catch (Exception ex) {
        }
    }
}