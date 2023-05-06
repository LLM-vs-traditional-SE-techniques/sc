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


public class CodexTest_0_5_8 { 
  @Test
  public void testGetAsInstance() {
    Instances inst = new Instances(new BufferedReader(new StringReader(
	"@relation Test\n" +
	"@attribute a1 numeric\n" +
	"@attribute a2 numeric\n" +
	"@attribute a3 numeric\n" +
	"@attribute a4 numeric\n" +
	"@attribute a5 {a,b,c,d}\n" +
	"@data\n" +
	"1,2,3,4,a\n" +
	"5,6,7,8,b\n" +
	"9,10,11,12,c\n" +
	"13,14,15,16,d\n")));
    inst.setClassIndex(4);
    AlgVector vec = new AlgVector(new double[]{1,2,3});
    try {
      Instance inst2 = vec.getAsInstance(inst, new Random(1));
      assertTrue(inst.equalHeaders(inst2.dataset()));
      assertEquals(1, inst2.value(0));
      assertEquals(2, inst2.value(1));
      assertEquals(3, inst2.value(2));
      assertTrue(0 <= inst2.value(3) && inst2.value(3) < 4);
      assertTrue(0 <= inst2.value(4) && inst2.value(4) < 4);
    } catch (Exception ex) {
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}