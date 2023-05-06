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


public class CodexTest_0_6_19 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(
				    new StringReader(
				    "Relation test\n"
				    + "Attribute a numeric\n"
				    + "Attribute b numeric\n"
				    + "Attribute c numeric\n"
				    + "Attribute d numeric\n"
				    + "Attribute e numeric\n"
				    + "Attribute f numeric\n"
				    + "Attribute g numeric\n"
				    + "Attribute h numeric\n"
				    + "Attribute i numeric\n"
				    + "Attribute j numeric\n"
				    + "Attribute k numeric\n"
				    + "Attribute l numeric\n"
				    + "Attribute m numeric\n"
				    + "Attribute n numeric\n"
				    + "Attribute o numeric\n"
				    + "Attribute p numeric\n"
				    + "Attribute q numeric\n"
				    + "Attribute r numeric\n"
				    + "Data\n\n"
				    + "@data\n"
				    + "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20\n\n")));
    AlgVector v = new AlgVector(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    Instance inst = v.getAsInstance(data, new Random(1));
    assertEquals("Length differs", data.numAttributes(), inst.numAttributes());
    for (int i = 0; i < data.numAttributes(); i++) {
      if (data.attribute(i
}