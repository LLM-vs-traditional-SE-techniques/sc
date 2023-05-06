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


public class CodexTest_0_3_30 { 
  @Test
    public void testGetAsInstance() throws Exception {
        Instances dataset = new Instances(new BufferedReader(new StringReader(
                "A,B,C,D\n" + "1,2,3,4\n" + "5,6,7,8\n" + "9,10,11,12\n"
                        + "13,14,15,16\n" + "17,18,19,20\n")));
        dataset.setClassIndex(dataset.numAttributes() - 1);
        AlgVector v = new AlgVector(dataset.numAttributes());
        for (int i = 0; i < dataset.numAttributes(); i++) {
            v.setElement(i, i + 1);
        }
        Instance inst = v.getAsInstance(dataset, new Random(1));
        assertEquals("Dataset differs", dataset, inst.dataset());
        assertEquals("Class differs", 1.0, inst.classValue());
        assertEquals("Value differs", 1.0, inst.value(0));
        assertEquals("Value differs", 2.0, inst.value(1));
        assertEquals("Value differs", 3.0, inst.value(2));
        assertEquals("Value differs", 4.0, inst.value(3));
    }
}