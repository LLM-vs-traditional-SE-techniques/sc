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


public class CodexTest_0_9_51 { 
    /**
     * Test the method getAsInstance in the class AlgVector
     */
    @Test
    public void testgetAsInstance(){
        AlgVector v = new AlgVector(4);
        Random random = new Random();
 
        double[] elements = {0.0, 1.0, 2.0, 3.0};
        Attribute attr1 = new Attribute("0");
        Attribute attr2 = new Attribute("1");
        Attribute attr3 = new Attribute("2"); 
        Attribute attr4 = new Attribute("3");
        List<Attribute> listAttr = new ArrayList<Attribute>();
        listAttr.add(attr1);
        listAttr.add(attr2);
        listAttr.add(attr3);
        listAttr.add(attr4);
        Instances model = new Instances("test", listAttr, 0);
        try {
            Instance newInst = v.getAsInstance(model, random);
            Double value1 = newInst.value(0);
            Double value2 = newInst.value(1);
            Double value3 = newInst.value(2);
            Double value4 = newInst.value(3);
            Instance newInstance = new DenseInstance(4);
            newInstance.setDataset(model);
            newInstance.setValue(0, elements[0]);
            newInstance.setValue(1, elements[1]);
            newInstance.setValue(2, elements[2]);
            newInstance.setValue(3, elements[3]);
            // if the model is numeric, the two instances should be the same
            assertTrue(newInst.equalHeaders(newInstance)
                    && newInstance.equalHeaders(newInst));
            assertTrue(newInstance.equalValues(newInst)
                    && newInst.equalValues(newInstance));
            // if the model is nominal, the number
            // of attributes in two instances should be the same
            assertEquals(newInst.numAttributes(), newInstance.numAttributes());
            //assertTrue(Double.compare(value1, elements[0])
}