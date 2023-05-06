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


public class CodexTest_0_4_41 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(new StringReader(
	"@relation test\n" +
	"@attribute a numeric\n" +
	"@attribute b numeric\n" +
	"@attribute c numeric\n" +
	"@attribute d numeric\n" +
	"@attribute e {x,y,z}\n" +
	"@data\n" +
	"1,2,3,4,x\n" +
	"5,6,7,8,y\n" +
	"9,10,11,12,z\n")));
    AlgVector v = new AlgVector(new double[]{1,2,3,4});
    Instance inst = v.getAsInstance(data, new Random(1));
    assertEquals(1.0, inst.value(0));
    assertEquals(2.0, inst.value(1));
    assertEquals(3.0, inst.value(2));
    assertEquals(4.0, inst.value(3));
    assertEquals(1, inst.value(4));
  }
}