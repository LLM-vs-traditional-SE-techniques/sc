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


public class CodexTest_0_3_1 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new FastVector(), 0);
        Instance instance = new DenseInstance(1);
        model.add(instance);
        Random random = new Random(1);
        Instance result = new DenseInstance(1);
        result.setDataset(model);
        result.setValue(0, 0);
        assertEquals(result, instance.getAsInstance(model, random));
    }
}