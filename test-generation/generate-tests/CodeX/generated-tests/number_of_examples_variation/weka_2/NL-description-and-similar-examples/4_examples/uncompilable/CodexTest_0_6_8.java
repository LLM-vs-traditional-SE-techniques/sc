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


public class CodexTest_0_6_8 { 
  @Test
    public void testGetAsInstance() throws Exception{
        // given
        AlgVector underTest = new AlgVector(new double[]{2.3, 1.2, 5.0});
        Instances model = Mockito.mock(Instances.class);
        Random random = Mockito.mock(Random.class);
        Mockito.when(model.numAttributes()).thenReturn(3);
        Mockito.when(model.attribute(0)).thenReturn(Mockito.mock(Attribute.class));
        Mockito.when(model.attribute(1)).thenReturn(Mockito.mock(Attribute.class));
        Mockito.when(model.attribute(2)).thenReturn(Mockito.mock(Attribute.class));
        Mockito.when(model.attribute(0).isNumeric()).thenReturn(true);
        Mockito.when(model.attribute(1).isNumeric()).thenReturn(true);
        Mockito.when(model.attribute(2).isNumeric()).thenReturn(true);
        Mockito.when(model.attribute(0).isNominal()).thenReturn(false);
        Mockito.when(model.attribute(1).isNominal()).thenReturn(false);
        Mockito.when(model.attribute(2).isNominal()).thenReturn(false);
        // when
        Instance result = underTest.getAsInstance(model, random);
        // then
        assertNotNull(result);
    }
}