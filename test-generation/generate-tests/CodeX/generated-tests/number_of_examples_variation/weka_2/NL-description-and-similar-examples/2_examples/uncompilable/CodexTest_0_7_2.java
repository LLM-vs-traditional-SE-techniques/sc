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
  public void testNominalAttribute() {
    try {
      Instances model = makeInstanceModel("att1", -1, "att2", -1);
      AlgVector v = new AlgVector(model);
      Instance i = v.getAsInstance(model, new Random(1));
      assertEquals("1. value differs", 0, (int) i.value(0));
      assertEquals("2. value differs", 1, (int) i.value(1));
      i = v.getAsInstance(model, new Random(2));
      assertEquals("1. value differs", 1, (int) i.value(0));
      assertEquals("2. value differs", 0, (int) i.value(1));
      i = v.getAsInstance(model, new Random(3));
      assertEquals("1. value differs", 1, (int) i.value(0));
      assertEquals("2. value differs", 1, (int) i.value(1));
      i = v.getAsInstance(model, new Random(4));
      assertEquals("1. value differs", 1, (int) i.value(0));
      assertEquals("2. value differs", 1, (int) i.value(1));
    }
}