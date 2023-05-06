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


public class CodexTest_0_4_9 { 
    @Test
    public void testGetAsInstance() throws Exception {
        Instance instance = new Instance(2);
        instance.setValue(0, 1.0);
        instance.setValue(1, 2.0);
        Instances dataset = new Instances("Test", new ArrayList<Attribute>(2), 1);
        dataset.add(instance);
        dataset.setClassIndex(1);
        Random random = new Random(1);
        random.setSeed(1);
        Instance result = Instance.getAsInstance(dataset, random);
        assertEquals(result.classValue(), 1.0, 0.0);
        assertEquals(result.value(0), 0.0, 0.0);
    }
}