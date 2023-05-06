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


public class CodexTest_0_4_5 { 
  @Test
    public void testGetAsInstance() {
    try {
      weka.core.Instances model = new Instances(new java.io.StringReader(
									"@relation test\n" +
									"@attribute a numeric\n" +
									"@attribute b numeric\n" +
									"@attribute c numeric\n" +
									"@attribute d numeric\n" +
									"@attribute e numeric\n" +
									"@attribute f numeric\n" +
									"@attribute g numeric\n" +
									"@attribute h numeric\n" +
									"@attribute i numeric\n" +
									"@attribute j numeric\n" +
									"@attribute k numeric\n" +
									"@attribute l numeric\n" +
									"@attribute m numeric\n" +
									"@attribute n numeric\n" +
									"@data\n" +
									"1,2,3,4,5,6,7,8,9,10,11,12,13,14,15\n"));
      double[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
      weka.core.Attribute att = model.attribute(0);
      weka.core.Instance inst = new weka.core.DenseInstance(1, values);
      inst.setDataset(model);
      weka.core.AttributeStats as = model.attributeStats(0);
      weka.core.AttributeStats as2 = model
}