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


public class CodexTest_0_8_85 { 
  @Test
  public void testAdd(){
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector w = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector z = new AlgVector(new double[]{2.0, 4.0, 6.0});
    assertEquals("add vectors",z,v.add(w));
  }
}