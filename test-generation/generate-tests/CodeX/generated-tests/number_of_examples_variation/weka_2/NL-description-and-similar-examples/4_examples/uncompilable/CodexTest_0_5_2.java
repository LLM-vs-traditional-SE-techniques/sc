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


public class CodexTest_0_5_2 { 
  @Test
  public void testGetAsInstance() throws Exception {
    // given
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new DenseInstance(1), 0);
    model.add(new DenseInstance(1));
    model.add(new DenseInstance(1));
    model.add(new DenseInstance(1));
    // when
    Instance result = v.getAsInstance(model, new Random());
    // then
    assertEquals("The model and the instance should have the same size",
        model.numAttributes(), result.numAttributes());
    assertEquals("The instance should have the same size as the array",
        data.length, result.numValues());
    for (int i = 0; i < data.length; i++)
      assertEquals((i+1) + ". value differs", data[i], result.value(i));
  }
}