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


public class CodexTest_0_9_6 { 
    @Test
    public void testGetAsInstanceException() throws Exception {
        DenseInstance d = new DenseInstance(3, new double[4]);
        Instances instances = mock(Instances.class);
        when(instances.numAttributes()).thenReturn(3);
        for (int i = 0; i < 3; i++) {
            when(instances.attribute(i)).thenReturn(mock(Attribute.class));
            when(instances.attribute(i).isNumeric()).thenReturn(true);
            when(instances.attribute(i).isNominal()).thenReturn(false);
        }
        Instance instance1 = d.getAsInstance(instances, new Random());
        Random mockRandom = mock(Random.class);
        when(mockRandom.nextDouble()).thenReturn(5.5);
        when(mockRandom.nextInt(anyInt())).thenReturn(5);
        when(instances.attribute(anyInt())).thenReturn(mock(Attribute.class));
        when(instances.attribute(anyInt()).numValues()).thenReturn(10);
        Instance instance2 = d.getAsInstance(instances, mockRandom);
        assertEquals(instance1, instance2);
    }
}