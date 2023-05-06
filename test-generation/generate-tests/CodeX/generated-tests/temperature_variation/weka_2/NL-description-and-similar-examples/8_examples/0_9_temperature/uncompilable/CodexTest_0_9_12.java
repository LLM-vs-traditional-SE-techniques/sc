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


public class CodexTest_0_9_12 { 
  @Test
  public void testGetAsInstance() {
    // create matrix
    AlgMatrix matrix = new AlgMatrix(1, 2);
    Random random = new Random(0);
    // add values
    matrix.setElement(0, 0, 0.5);
    matrix.setElement(0, 1, 0.6);
    // create attribute list
    List<Attribute> attrs = new ArrayList<Attribute>();
    attrs.add(new Attribute("attr1"));
    attrs.add(new Attribute("attr2"));
    Instances data = new Instances("root", attrs, 10);
    // create instance
    Instance inst = matrix.getAsInstance(data, random);
    Assert.assertEquals("Num attributes differ!", 2, inst.numAttributes());
    Assert.assertEquals("Num values differ!", 2, inst.numValues());
    Assert.assertEquals("Value 0 differs!", 0.5, inst.value(0));
    Assert.assertEquals("Value 1 differs!", 0.6, inst.value(1));
  }

}