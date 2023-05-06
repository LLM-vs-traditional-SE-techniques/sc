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


public class CodexTest_0_4_4 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "A,B,C\n" + "1,2,3\n" + "4,5,6\n" + "7,8,9\n" + "10,11,12\n"
                        + "13,14,15\n")));
        model.setClassIndex(model.numAttributes() - 1);
        DenseInstance instance = new DenseInstance(1, new double[] { 1, 2, 3 });
        instance.setDataset(model);
        DenseInstance result = instance.getAsInstance(model, new Random(1));
        assertEquals(instance.numAttributes(), result.numAttributes());
        assertEquals(instance.numClasses(), result.numClasses());
        assertEquals(instance.numValues(), result.numValues());
        assertEquals(instance.toString(), result.toString());
    }
}