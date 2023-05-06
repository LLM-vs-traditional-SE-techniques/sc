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


public class CodexTest_0_6_68 { 
  @Test
    public void testGetAsInstance() {
        AlgVector v = new AlgVector(2);
        v.setElement(0, 1.0);
        v.setElement(1, 2.0);
        Instances insts = new Instances(new BufferedReader(
                new StringReader(AlgVectorTest.DATATYPE_HEADER)));
        insts.setClassIndex(insts.numAttributes() - 1);
        Instance instance = v.getAsInstance(insts, new Random(1));
        assertEquals("Wrong number of attributes", insts.numAttributes(), 
                instance.numAttributes());
        assertEquals("Wrong value", 1.0, instance.value(0), 
                AlgVectorTest.DOUBLE_PRECISION);
        assertEquals("Wrong value", 2.0, instance.value(1), 
                AlgVectorTest.DOUBLE_PRECISION);
        assertEquals("Wrong class value", 1.0, instance.classValue(), 
                AlgVectorTest.DOUBLE_PRECISION);
    }
}