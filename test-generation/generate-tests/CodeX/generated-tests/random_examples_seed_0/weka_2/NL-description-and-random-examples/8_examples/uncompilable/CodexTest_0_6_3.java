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


public class CodexTest_0_6_3 { 
    @Test
    public void testGetAsInstance() throws Exception {
        weka.classifiers.evaluation.Random random = new weka.classifiers.evaluation.Random();
        Instances model = new Instances();
        model.setClassIndex(0);
        model.add(new Attribute("a", (List<String>) null));
        double[] doubles = new double[1];
        doubles[0] = 1.0;
        Instance instance = new SparseInstance(1);
        instance.setDataset(model);
        instance.setValue(0, 0);
        double[] doubles1 = new double[3];
        doubles1[0] = 1.0;
        doubles1[1] = 2.0;
        doubles1[2] = 3.0;
        SparseInstance sparseInstance = new SparseInstance(0, doubles1);
        Instance result = sparseInstance.getAsInstance(model, random);
        Assert.assertEquals(sparseInstance.classIndex(), 0);
        Assert.assertEquals(sparseInstance.getWeight(), 1.0, 0);
        Assert.assertEquals(sparseInstance.numAttributes(), 3);
        Assert.assertEquals(sparseInstance.numValues(), 3);
        Assert.assertEquals(sparseInstance.numInputAttributes(), 3);
        Assert.assertEquals(sparseInstance.numClasses(), 0);
        Assert.assertEquals(sparseInstance.toString(1), "1.0");
        Assert.assertEquals(sparseInstance.toString(), "1.0, 2.0, 3.0");
        Assert.assertEquals(result.weight(), 1.0, 0);
        Assert.assertEquals(result.numAttributes(), 3);
        Assert.assertEquals(result.numValues(), 3);
        Assert.assertEquals(result.numInputAttributes(), 3);
        Assert.assertEquals(result.numClasses(), 0);
        Assert.assertEquals(result.toString(1), "1.0");
        Assert.assertEquals
}