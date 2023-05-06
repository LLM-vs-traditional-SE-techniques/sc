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


public class CodexTest_0_5_98 { 
    @Test
    public void testGetAsInstance_Nominal() {
        AlgVector vector = new AlgVector(new double[]{1, 2, 3});
        Instances instances = mock(Instances.class);
        Attribute attribute1 = mock(Attribute.class);
        Attribute attribute2 = mock(Attribute.class);
        Attribute attribute3 = mock(Attribute.class);
        Random random = mock(Random.class);
        when(instances.numAttributes()).thenReturn(3);
        when(instances.attribute(0)).thenReturn(attribute1);
        when(instances.attribute(1)).thenReturn(attribute2);
        when(instances.attribute(2)).thenReturn(attribute3);
        when(attribute1.isNumeric()).thenReturn(true);
        when(attribute2.isNumeric()).thenReturn(true);
        when(attribute3.isNumeric()).thenReturn(true);
        when(attribute1.isNominal()).thenReturn(false);
        when(attribute2.isNominal()).thenReturn(false);
        when(attribute3.isNominal()).thenReturn(false);
        when(random.nextDouble()).thenReturn(0.5);
        when(attribute1.numValues()).thenReturn(3);
        when(attribute2.numValues()).thenReturn(3);
        when(attribute3.numValues()).thenReturn(3);
}