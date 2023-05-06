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


public class CodexTest_0_6_10 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "C1,C2\n" + "0,0\n" + "1,1\n" + "0,1\n" + "1,0\n")));
        model.setClassIndex(model.numAttributes() - 1);
        AlgVector v = new AlgVector(new double[]{1.0,1.0});
        Instance inst = v.getAsInstance(model, new Random(1));
        assertEquals(inst.classValue(), 1.0);
    }
}