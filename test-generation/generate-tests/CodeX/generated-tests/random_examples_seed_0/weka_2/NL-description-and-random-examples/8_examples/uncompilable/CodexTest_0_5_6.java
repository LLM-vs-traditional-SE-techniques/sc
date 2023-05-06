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


public class CodexTest_0_5_6 { 
  @Test
    public void testGetAsInstance() {
        // given
        double[] elements = new double[] { 1, 2, 3 };
        Instances model = mock(Instances.class);
        when(model.numAttributes()).thenReturn(3);
        Attribute attribute = mock(Attribute.class);
        when(model.attribute(anyInt())).thenReturn(attribute);
        when(attribute.isNumeric()).thenReturn(true);
        Random random = mock(Random.class);
        when(random.nextDouble()).thenReturn(0.5);
        when(attribute.numValues()).thenReturn(2);
        DenseInstance d1 = new DenseInstance(elements);
        // when
        Instance result = d1.getAsInstance(model, random);
        // then
        assertEquals(1.0, result.value(0), 0.0);
        assertEquals(2.0, result.value(1), 0.0);
        assertEquals(3.0, result.value(2), 0.0);
    }

}