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


public class CodexTest_0_7_91 { 
  @Test
    public void testSetDataset() {
        double[] d = new double[2];
        d[0] = Instance.missingValue();
        d[1] = Instance.missingValue();
        SparseInstance instance = new SparseInstance(1, d);
        Instances structure = new Instances(m_Instances, 0);
        instance.setDataset(structure);
        assertEquals("testSetDataset", structure, instance.dataset());
    }
```
}