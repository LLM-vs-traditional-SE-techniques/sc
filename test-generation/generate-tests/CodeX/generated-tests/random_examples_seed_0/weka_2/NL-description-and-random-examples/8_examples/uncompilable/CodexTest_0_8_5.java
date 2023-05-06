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


public class CodexTest_0_8_5 { 
  @Test
        public void testGetAsInstance() {
            Instances dataset = null;
            Random random = Randomizable.makeRandomGenerator(5);
            double[] elements = null;
            numericToNominal converter = new numericToNominal();
            converter.setAttributeIndices("1");
            try {
                converter.setInputFormat(new Instances(new BufferedReader(new StringReader(instances))));
                converter.getOutputFormat();
                dataset = converter.getOutputFormat();
                converter.input(new Instance(1.0, new double[1]));
                elements = converter.getIncoming(0).getAsInstance(dataset, random).toDoubleArray();
            } catch (Exception e) {
                assertTrue(false);
            }
            assertTrue(elements.length == 1);
            assertTrue(elements[0] == 0);
        }

}