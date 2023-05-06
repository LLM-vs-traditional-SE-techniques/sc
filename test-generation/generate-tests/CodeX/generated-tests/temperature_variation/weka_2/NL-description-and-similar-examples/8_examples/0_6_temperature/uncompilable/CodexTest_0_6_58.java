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


public class CodexTest_0_6_58 { 
  @Test
    public void testGetAsInstance() {
        int num = 5;
        double[] values = {0.5, 0.6, 0.7, 0.8, 0.9};
        double[] values2 = {0.5, 0.6, 0.7, 0.8, 0.9, 0.0};
        AlgVector v = new AlgVector(values);
        Instances insts = new Instances(new BufferedReader(new StringReader(InstancesTest.IRIS_WITH_STRING_ATTRIBUTES)), num);
        Instances insts2 = new Instances(new BufferedReader(new StringReader(InstancesTest.IRIS_WITH_STRING_ATTRIBUTES)), num);
        Random rand = new Random(System.currentTimeMillis());
        Instance inst = v.getAsInstance(insts, rand);
        assertEquals("Number of values incorrect", num, inst.numValues());
        assertEquals("Number of attributes incorrect", num + 1, inst.numAttributes());
        assertEquals("Number of classes incorrect", 3, inst.numClasses());
        for (int i = 0; i < inst.numAttributes() - 1; i++) {
            if (inst.attribute(i).isNumeric())
                assertEquals("Numeric value incorrect", values[i], inst.value(i), 1e-6);
            if (inst.attribute(i).isNominal())
                assertEquals("Nominal value incorrect", 0, inst.value(i), 1e-6);
        }
        inst = v.getAsInstance(insts2, rand);
        assertEquals("Number of values incorrect", num, inst.numValues());
        assertEquals("Number of attributes incorrect", num + 1, inst.numAttributes());
        assertEquals("Number of classes incorrect", 3, inst.numClasses());
        for (int i = 0; i < inst.numAttributes() - 1; i++) {
            if (inst.attribute(i).isNumeric())
                assertEquals("Numeric value incorrect", values[i], inst.value(i), 1e-6
}