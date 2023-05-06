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


public class CodexTest_0_7_2 { 
  @Test
    public void testGetAsInstance() {
        Instances model = mock(Instances.class);
        Random random = mock(Random.class);
        double[] elements = {1.0, 2.0, 3.0, 4.0};
        DenseInstance instance = mock(DenseInstance.class);
        DenseInstance underTest = new DenseInstance(elements);
        when(model.numAttributes()).thenReturn(4);
        when(model.attribute(anyInt())).thenReturn(mock(Attribute.class));
        when(random.nextDouble()).thenReturn(0.5);
        when(model.attribute(anyInt()).isNumeric()).thenReturn(true);
        when(model.attribute(anyInt()).isNominal()).thenReturn(false);
        when(model.attribute(anyInt()).numValues()).thenReturn(3);
        when(instance.setDataset(model)).thenReturn(instance);
        when(instance.setValue(anyInt(), anyDouble())).thenReturn(instance);
        when(instance.setValue(anyInt(), anyInt())).thenReturn(instance);
        DenseInstance result = underTest.getAsInstance(model, random);
        for (int i = 0; i < elements.length; i++) {
            verify(model.attribute(i)).isNumeric();
            verify(instance).setValue(i, elements[i]);
        }
    }
}