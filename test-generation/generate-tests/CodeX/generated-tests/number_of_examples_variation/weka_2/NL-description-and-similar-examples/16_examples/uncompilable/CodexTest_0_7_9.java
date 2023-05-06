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


public class CodexTest_0_7_9 { 
  @Test
    public void testGetAsInstance() {
        int numAttributes = 2;
        Instances model = makeModel(numAttributes);
        double values[] = {1, 2};
        SparseInstance instance = new SparseInstance(1, values);
        instance.setDataset(model);
        instance.setValue(0, 3);
        instance.getAsInstance(model, new Random(1));
        assertEquals(3, instance.value(0));
        assertEquals(2, instance.value(1));
    }
}