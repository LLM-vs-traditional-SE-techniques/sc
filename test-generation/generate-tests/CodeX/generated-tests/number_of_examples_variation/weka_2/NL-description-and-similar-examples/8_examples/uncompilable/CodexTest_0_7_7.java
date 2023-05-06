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


public class CodexTest_0_7_7 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(new StringReader(
	"@relation testGetAsInstance\n" +
	"@attribute att1 numeric\n" +
	"@attribute att2 numeric\n" +
	"@attribute att3 numeric\n" +
	"@attribute att4 numeric\n" +
	"@attribute att5 numeric\n" +
	"@data\n" +
	"0.0, 1.1, 2.2, 3.3, 4.4\n" +
	"0.0, 1.1, 2.2, 3.3, 4.4\n" +
	"0.0, 1.1, 2.2, 3.3, 4.4\n" +
	"0.0, 1.1, 2.2, 3.3, 4.4\n" +
	"0.0, 1.1, 2.2, 3.3, 4.4\n")));
    // create a single instance
    AlgVector v = new AlgVector(model.numAttributes());
    v.setElement(0, 0.0);
    v.setElement(1, 1.1);
    v.setElement(2, 2.2);
    v.setElement(3, 3.3);
    v.setElement(4, 4.4);
    // get instance
    Random random = new Random(1);
    Instance i = v.getAsInstance(model, random);
    assertEquals("Number of attributes differ", model.numAttributes(),
		 i.numAttributes());
    assertEquals("0th value differs", 0.0, i.value(0));
    assertEquals("1th value differs", 1.1, i.value(1));
    assertEquals("2th value differs", 2.2, i.value(2));
    assertEquals("3th value differs", 3.3, i.value(3));
    assertEquals("4th value differs", 4.4, i.value
}