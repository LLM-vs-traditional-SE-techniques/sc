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


public class CodexTest_0_7_4 { 
  @Test
    public void testWekaInstance() throws Exception {
        Instances emptyData = new Instances(new BufferedReader(new StringReader(
                "@@relation test\n"
                + "\n"
                + "@attribute a numeric\n"
                + "@attribute b numeric\n"
                + "@attribute c numeric\n"
                + "\n"
                + "@data\n")));
        AlgVector vector = new AlgVector(new double[]{1, 2, 3});
        Instance instance = vector.getAsInstance(emptyData, new Random(1));
        AlgVector vector2 = new AlgVector(instance);
        for (int i = 0; i < vector.numElements(); i++) {
            assertEquals((i + 1) + ". value differs", vector.getElement(i), vector2.getElement(i), 1e-15);
        }
    }
}