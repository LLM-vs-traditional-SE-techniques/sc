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


public class CodexTest_0_9_74 { 
  @Test
  public void testAdd6() {
    final int max = 8;
    final AlgVector.Factory factory = AlgVector.Factory.doubleInstance(max);
    final AlgVector a = factory.createRandom();
    final AlgVector b = factory.createRandom();
    final AlgVector c = a.add(b);
    for(int i = 0; i < max; i++) {
      assertEquals((i+1) +  ".vector element differs", a.getElement(i) + b.getElement(i), c.getElement(i));
    }
  }
}