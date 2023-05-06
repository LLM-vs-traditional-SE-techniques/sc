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


public class CodexTest_0_3_3 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new FileReader(
                "src/test/resources/nominal.arff")));
        model.setClassIndex(model.numAttributes() - 1);
        Random random = new Random(1);
        Instance result = new Instance(1.0, new double[]{1.0});
        result.setDataset(model);
        Instance newInst = result.getAsInstance(model, random);
        assertEquals(result.classIndex(), newInst.classIndex());
        assertEquals(result.classValue(), newInst.classValue());
        assertEquals(result.classIsMissing(), newInst.classIsMissing());
        assertEquals(result.classAttribute(), newInst.classAttribute());
        assertEquals(result.numAttributes(), newInst.numAttributes());
        assertEquals(result.numClasses(), newInst.numClasses());
        assertEquals(result.numValues(), newInst.numValues());
        assertEquals(result.weight(), newInst.weight());
        assertEquals(result.toString(1), newInst.toString(1));
        assertEquals(result.toString(2), newInst.toString(2));
        assertEquals(result.toString(3), newInst.toString(3));
        assertEquals(result.toString(4), newInst.toString(4));
        assertEquals(result.toString(5), newInst.toString(5));
        assertEquals(result.toString(6), newInst.toString(6));
        assertEquals(result.toString(7), newInst.toString(7));
        assertEquals(result.toString(8), newInst.toString(8));
        assertEquals(result.toString(9), newInst.toString(9));
        assertEquals(result.toString(10), newInst.toString(10));
        assertEquals(result.toString(11), newInst.toString(11));
        assertEquals
}