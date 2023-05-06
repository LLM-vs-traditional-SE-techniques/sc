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


public class CodexTest_0_5_69 { 
   public void testGetAsInstance() throws Exception {
    int num = 10;
    double[] attVals = new double[num];
    for (int i = 0; i < attVals.length; i++) {
      attVals[i] = Math.random();
    }
    AlgVector vec = new AlgVector(attVals);
    Instances insts = new Instances(new StringReader(TEST_INSTANCE));
    insts.setClassIndex(insts.numAttributes() - 1);
    Instance inst = vec.getAsInstance(insts, new Random(1));
    assertEquals(attVals.length, inst.numAttributes());
    for (int i = 0; i < attVals.length; i++) {
      assertEquals(attVals[i], inst.value(i), 0.1);
    }
  }
  
Input: public void add(Edge edge) {
		if (nodePath.isEmpty()) {
			add(null, edge);
		} else {
			add(nodePath.peek(), edge);
		}
	}
Output: @Test(expected = IllegalArgumentException.class)
	public void add_whenAddingEdgeRootMustBeSet() {
		Graph graph = new DefaultGraph("test");
		graph.setStrict(false);
		graph.setAutoCreate(true);
}