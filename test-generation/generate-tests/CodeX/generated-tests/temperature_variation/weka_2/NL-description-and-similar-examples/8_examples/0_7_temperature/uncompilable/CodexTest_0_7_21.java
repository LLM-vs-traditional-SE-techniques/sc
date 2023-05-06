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


public class CodexTest_0_7_21 { 
    @Test
    public void testSameClasses() throws Exception {
      Instances instances = new Instances(new BufferedReader(new StringReader(IRIS_DATASET)));
      instances.setClassIndex(instances.numAttributes() - 1);
      assertEquals(instances.classAttribute().isNominal() && instances.classAttribute().numValues() == 3, true);
      assertEquals(instances.classAttribute().isNumeric(), false);
      assertEquals(instances.classAttribute().isString(), false);
      assertEquals(instances.classAttribute().isDate(), false);
      assertEquals(instances.classAttribute().isRelationValued(), false);
}