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


public class CodexTest_0_7_60 { 
  @Test
            public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "1,1\n1,2\n1,3\n2,1\n2,2\n2,3\n3,1\n3,2\n3,3\n")), false);
        model.setClassIndex(model.numAttributes() - 1);
        AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
        Instance inst = v.getAsInstance(model, null);
        assertEquals(1.0, inst.value(0));
        assertEquals(2.0, inst.value(1));
        assertEquals(3.0, inst.value(2));
            }

}