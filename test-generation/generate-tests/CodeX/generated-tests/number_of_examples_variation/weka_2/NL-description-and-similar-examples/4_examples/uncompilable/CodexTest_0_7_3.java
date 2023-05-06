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


public class CodexTest_0_7_3 { 
  @Test
    public void testGetAsInstance() {
    // given
    Instances model = mock(Instances.class);
    when(model.numAttributes()).thenReturn(1);
    when(model.attribute(anyInt())).thenReturn(mock(Attribute.class));
    when(model.attribute(anyInt()).isNumeric()).thenReturn(true);
    when(model.attribute(anyInt()).isNominal()).thenReturn(false);
    AlgVector v = new AlgVector(2);
    v.setElement(0, 1.0);
    v.setElement(1, 2.0);
    Random random = mock(Random.class);
    when(random.nextDouble()).thenReturn(3.0);
    // when
    try {
      Instance result = v.getAsInstance(model, random);
      // then
      assertEquals(2.0, result.value(0), 0.00001);
    } catch (Exception e) {
      fail(e.getMessage());
    }
  }
}