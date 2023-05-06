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


public class CodexTest_0_8_3 { 
  @Test
  public void testAddToShort() {
    AlgVector v = new AlgVector(5);
    AlgVector w = new AlgVector(5);
    AlgVector a = null;
       try {
	w = (AlgVector)v.clone();
      } catch (CloneNotSupportedException ex) {
	w = new AlgVector(5);
      }
    AlgVector b = new AlgVector(7);
    a = v.add(w);
    b = v.add(b);
  }
}