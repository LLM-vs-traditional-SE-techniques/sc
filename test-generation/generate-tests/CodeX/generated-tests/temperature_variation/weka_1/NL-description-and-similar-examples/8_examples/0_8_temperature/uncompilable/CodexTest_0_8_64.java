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


public class CodexTest_0_8_64 { 
  @Test
  public void addTest(){
  AlgVector v1 = new AlgVector(1.0, -1.0, 12.0);
       AlgVector v2 = new AlgVector(2.0, -2.0, 12.0);
       AlgVector v3 = new AlgVector(3.0, -3.0, 12.0);
       AlgVector v4 = new AlgVector(4.0, -4.0, 12.0);
       AlgVector v = v1.add(v2);
       v = v.add(v3);
       v = v.add(v4);
       assertEquals(new AlgVector(10.0, -10.0, 48.0), v);
  }
}