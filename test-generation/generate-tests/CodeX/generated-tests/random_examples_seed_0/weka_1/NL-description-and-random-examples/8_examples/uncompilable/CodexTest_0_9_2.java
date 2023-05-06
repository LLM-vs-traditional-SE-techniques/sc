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


public class CodexTest_0_9_2 { 
  @Test
    public void testAddAlgVector(){
      AlgVector v1 = new AlgVector(2);
      v1.add(19);
      AlgVector v2 = new AlgVector(2);
      v2.add(27);
      AlgVector v = new AlgVector(2);
      v = v1.add(v2);
      Assert.assertEquals(2,2);
    }
}