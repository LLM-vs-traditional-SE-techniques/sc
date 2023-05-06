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


public class CodexTest_0_8_46 { 
  @Test
        public void testGetAsInstance() throws Exception {
            int aSize = 10;
            int bSize = 3;
            int cSize = 4;
            Instances model = new Instances(new BufferedReader(new StringReader(
                    "@relation test\n"
                            + "@attribute a1 numeric\n"
                            + "@attribute a2 numeric\n"
                            + "@attribute b1 {1,2,3}\n"
                            + "@attribute b2 {3,4}\n"
                            + "@attribute c1 {3,4}\n"
                            + "@attribute c2 {1,2,3}\n"
                            + "@attribute c3 {5,6}\n"
                            + "@attribute c4 {1,2,3,4}\n"
                            + "@class a1\n"
                            + "@attribute c1 {1,2,3}\n"
                            + "@attribute c2 {3,4,5}\n"
                            + "@class a1\n")));
            int numElements = (aSize + bSize + cSize) * 2;
            double[] vals = new double[numElements];
            Random random = new Random(1);
            for (int i = 0; i < numElements; i++) {
                vals[i] = random.nextDouble();
            }
            Instance newInst = new DenseInstance(model.numAttributes());
            newInst.setDataset(model);
            AlgVector vector = new AlgVector(vals);
            vector.getAsInstance(model, random);
            assertTrue("Datatypes match", newInst.equalHeaders(newInst));
        }
}