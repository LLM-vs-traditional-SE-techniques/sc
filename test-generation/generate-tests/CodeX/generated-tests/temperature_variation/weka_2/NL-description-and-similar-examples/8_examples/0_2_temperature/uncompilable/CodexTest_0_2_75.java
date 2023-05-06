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


public class CodexTest_0_2_75 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n" + "1,2,3\n" + "4,5,6\n")));
        AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
        Instance newInst = v.getAsInstance(model, new Random(1));
        assertEquals("Datatypes are not compatible.", 1.0, newInst.value(0),
                0.0);
        assertEquals("Datatypes are not compatible.", 2.0, newInst.value(1),
                0.0);
        assertEquals("Datatypes are not compatible.", 3.0, newInst.value(2),
                0.0);
    }
}