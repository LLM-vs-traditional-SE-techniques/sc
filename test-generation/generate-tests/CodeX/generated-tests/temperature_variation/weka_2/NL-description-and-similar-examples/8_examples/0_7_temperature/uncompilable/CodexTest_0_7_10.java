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


public class CodexTest_0_7_10 { 
  @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader("@relation test\n@attribute A NUMERIC\n@attribute B NUMERIC\n@attribute C {A, B, C}\n\n@data\n0.5, 1.5, A\n")), 10);
        model.setClassIndex(2);
        AlgVector v = new AlgVector(2);
        v.setElement(0, 0.5);
        v.setElement(1, 1.5);
        Instance i = v.getAsInstance(model, new Random(1));
        assertEquals("A", i.stringValue(2));
    }
}