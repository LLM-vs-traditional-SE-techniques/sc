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


public class CodexTest_0_8_92 { 
  @Test
    public void testGetAsInstanceCanBeCalledWithRandomGenerator() throws Exception {
        final Instances dataset = createDummyDataset();
        Random random = mock(Random.class);
        when(random.nextDouble()).thenReturn(5.5, 4.1, 1.5);
        AlgVector.getAsInstance(dataset, random);
    }
}