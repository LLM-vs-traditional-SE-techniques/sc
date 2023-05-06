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


public class CodexTest_0_1_33 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new DenseInstance(v.numElements()), 0);
			model.setClassIndex(model.numAttributes() - 1);
			model.insertAttributeAt(new Attribute("test"), 0);
			model.insertAttributeAt(new Attribute("test2"), 0);
			model.insertAttributeAt(new Attribute("test3"), 0);
			model.insertAttributeAt(new Attribute("test4"), 0);
			model.insertAttributeAt(new Attribute("test5"), 0);
			model.insertAttributeAt(new Attribute("test6"), 0);
			model.insertAttributeAt(new Attribute("test7"), 0);
			model.insertAttributeAt(new Attribute("test8"), 0);
			model.insertAttributeAt(new Attribute("test9"), 0);
			model.insertAttributeAt(new Attribute("test10"), 0);
			model.insertAttributeAt(new Attribute("test11"), 0);
			model.insertAttributeAt(new Attribute("test12"), 0);
			model.insertAttributeAt(new Attribute("test13"), 0);
			model.insertAttributeAt(new Attribute("test14"), 0);
			model.insertAttributeAt(new Attribute("test15"), 0);
			model.insertAttributeAt(new Attribute("test16"), 0);
			model.insertAttributeAt(new Attribute("test17"), 0);
			model.insertAttributeAt(new Attribute("test18"), 0);
			model.insertAttributeAt(new Attribute("test19"), 0);
			model.insertAttributeAt(new Attribute("test20"), 0);
			model.insertAttributeAt(new Attribute("test21"), 0);
			model.insertAttributeAt(new Att
}