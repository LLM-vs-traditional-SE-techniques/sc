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


public class CodexTest_0_4_82 { 
  @Test
    public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
									"@relation test\n"
									+ "@attribute a numeric\n"
									+ "@attribute b numeric\n"
									+ "@attribute c {x,y}\n"
									+ "@attribute d {x,y}\n"
									+ "@attribute e {x,y}\n"
									+ "@data\n"
									+ "1,2,x,x,x\n"
									+ "3,4,y,y,y\n"
									+ "5,6,x,x,x\n"
									+ "7,8,y,y,y\n")));
    AlgVector v = new AlgVector(new double[]{1,2});
    Random random = new Random(1);
    Instance newInst = v.getAsInstance(model, random);
    assertEquals("a", 1.0, newInst.value(0), 0.0);
    assertEquals("b", 2.0, newInst.value(1), 0.0);
    assertEquals("c", 0.0, newInst.value(2), 0.0);
    assertEquals("d", 0.0, newInst.value(3), 0.0);
    assertEquals("e", 0.0, newInst.value(4), 0.0);
  }
}