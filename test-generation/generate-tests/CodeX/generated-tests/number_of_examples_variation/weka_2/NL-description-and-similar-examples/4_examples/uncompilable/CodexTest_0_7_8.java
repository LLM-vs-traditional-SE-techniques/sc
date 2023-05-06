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


public class CodexTest_0_7_8 { 
  @Test
    public void testGetAsInstanceWithNumAttributesAndNumValues() throws Exception {
        //given
        Instances model = getInstances();
        double[] elements = {1.3, 2.4};
        AlgVector underTest = new AlgVector(elements);
        Random random = new Random();
        //when
        Instance result = underTest.getAsInstance(model, random);
        //then
        assertEquals(model.numAttributes(), result.numAttributes());
        assertEquals(model.numValues(), result.numValues());
    }
```
}