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


public class CodexTest_0_4_10 { 
  @Test
  public void testGetAsInstance() {
    double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    AlgVector v = new AlgVector(values);
    Instances model = new Instances(new BufferedReader(new StringReader(
        "C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,C11,C12,C13,C14,C15,C16,C17,C18,C19,C20\n"
        + "numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric,numeric")));
    Instance inst = v.getAsInstance(model, new Random(1));
    assertEquals(values.length, inst.numAttributes());
    for (int i = 0; i < values.length; i++) {
      assertEquals((i+1) + ". value differs", values[i], inst.value(i));
    }
  }
}