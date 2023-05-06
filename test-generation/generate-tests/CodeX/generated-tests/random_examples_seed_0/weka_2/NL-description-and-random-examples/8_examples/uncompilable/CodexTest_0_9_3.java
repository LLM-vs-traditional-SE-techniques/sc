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


public class CodexTest_0_9_3 { 
     * (non-Javadoc)
      *
      * @see weka.core.DenseInstance#getAsInstance(weka.core.Instances, java.util.Random)
      */
     @Test
     public void testGetAsInstanceDenseInstance() throws Exception {
       DenseInstance denseInstance = new DenseInstance(22);
       Instances dataset = new Instances("Test", new ArrayList<Attribute>(), 2);
       Random random = new Random();
       dataset.add(denseInstance);
       dataset.add(denseInstance);
       dataset.add(denseInstance);
       dataset.setClassIndex(dataset.numAttributes() - 1);
}