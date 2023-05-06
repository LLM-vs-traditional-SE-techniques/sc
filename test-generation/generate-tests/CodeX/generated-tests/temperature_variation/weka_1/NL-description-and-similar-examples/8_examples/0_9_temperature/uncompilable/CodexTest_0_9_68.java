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


public class CodexTest_0_9_68 { 
  @Test
   public void testAdd()
  {
    AlgVector a = new AlgVector(new double[] { 1, 2, 3 });
    AlgVector b = new AlgVector(new double[] { 4, 5, 6 });
    assertTrue("Simple addition", new AlgVector(new double[] { 1, 2, 3 }).add(
        new AlgVector(new double[] { 1, 1, 1 })).equals(
        new AlgVector(new double[] { 2, 3, 4 })));
    assertTrue("Chaining addition", a.add(b).add(b).equals(
        new AlgVector(new double[] { 9, 12, 15 })));
}