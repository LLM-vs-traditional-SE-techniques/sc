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


public class CodexTest_0_6_7 { 
  @Test
    public void testGetAsInstance() throws Exception {
        Instances data = new Instances(new BufferedReader(new StringReader(
                "num,nom\n" + "numeric,{1,2,3}\n" + "numeric,{4,5,6}\n"
                        + "numeric,{7,8,9}")));
        data.setClassIndex(data.numAttributes() - 1);
        Random random = new Random(0);
        AlgVector v = new AlgVector(new double[] { 1.0, 2.0, 3.0 });
        Instance i = v.getAsInstance(data, random);
        assertEquals(1.0, i.value(0));
        assertEquals(2.0, i.value(1));
        assertEquals(0, i.classValue());
    }
}