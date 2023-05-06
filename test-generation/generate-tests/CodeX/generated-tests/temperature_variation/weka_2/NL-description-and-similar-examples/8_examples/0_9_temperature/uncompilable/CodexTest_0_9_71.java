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


public class CodexTest_0_9_71 { 
  @Test
    /**
     * Tests the Instance getAsInstance(Instances model, Random random) method
     */
    public void testGetAsInstance() {
        
        double[] coords = {3.3, 44.4, 5.0, 4.0};
        AlgVector v = new AlgVector(coords);
        
        try {
            // Set up an empty dataset of 4 attributes
            Instances d = new Instances(new Instances(m_Instances, 0), 0);
            d.setClassIndex(0);
            
            // Get the (randomly generated) Instance
            Instance inst = v.getAsInstance(d, m_Random);
            assertEquals(4, inst.numAttributes());
            
            // Check that the instance coordinates correspond to the original
            // vector
            for (int i = 0; i < inst.numAttributes(); i++) {
                assertEquals(coords[i], inst.value(i));
            }
                
            // Set up an empty dataset of 1 class attribute
            d = new Instances(new Instances(m_NominalInstances, 0), 0);
            d.setClassIndex(0);
            
            // Get the (randomly generated) Instance
            inst = v.getAsInstance(d, m_Random);
            assertEquals(1, inst.numAttributes());
            
            // Check that the instance contains a value (randomly generated)
            // from the attribute values
            int[] counts = new int[2];
            for (int i = 0; i < 3; i++) {
                counts[(int)inst.value(0)]++;
            }
            for (int i = 0; i < counts.length; i++) {
                assertTrue("No values for nominal attribute", counts[i] > 0);
                counts[i] = 0;
            }
}