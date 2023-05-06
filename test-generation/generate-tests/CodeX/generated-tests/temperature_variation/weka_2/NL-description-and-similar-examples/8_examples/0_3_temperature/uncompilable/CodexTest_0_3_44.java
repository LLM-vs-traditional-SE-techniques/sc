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


public class CodexTest_0_3_44 { 
  @Test
    public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new StringReader(
						     "@relation test\n"
						     + "@attribute att1 numeric\n"
						     + "@attribute att2 numeric\n"
						     + "@attribute att3 numeric\n"
						     + "@attribute att4 numeric\n"
						     + "@attribute att5 numeric\n"
						     + "@attribute att6 numeric\n"
						     + "@attribute att7 numeric\n"
						     + "@attribute att8 numeric\n"
						     + "@attribute att9 numeric\n"
						     + "@attribute att10 numeric\n"
						     + "@attribute att11 numeric\n"
						     + "@attribute att12 numeric\n"
						     + "@attribute att13 numeric\n"
						     + "@attribute att14 numeric\n"
						     + "@data\n"
						     + "1,2,3,4,5,6,7,8,9,10,11,12,13,14"));
    try {
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals("Number of attributes differs", model.numAttributes(),
		   inst.numAttributes());
      assertEquals("Number of values differs", model.numAttributes(),
		   inst.numValues());
      assertEquals("Number of missing values differs", 0,
		   inst.numMissing());
      for (int i = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric()) {
	  assertEquals("Value
}