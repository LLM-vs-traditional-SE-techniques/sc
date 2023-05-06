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


public class CodexTest_0_9_23 { 
  @Test
    public void testGetAsInstanceClassifier() throws Exception {
    load("nominal.arff");
    Instances data = getInstances();
    Instances insts = new Instances(data, 5);
    for (int i = 0; i < 5; i++)
      insts.add(getInstance(m_Instances, i));
    LinearRegression cls = new LinearRegression();
    cls.buildClassifier(insts);
    int start = 5;
    int num = 5;
    insts = new Instances(data, start, num);
    int c = 0;
    for (int i = start; i < start + num; i++) {
      Instance newInst = getInstance(data, i).getAsInstance(data, m_Random);
      double pred = cls.classifyInstance(newInst);
      if (Utils.eq(pred, newInst.classValue()))
	c++;
    }
    assertTrue("Instances not successfully transformed.", 
	       ((double)c / (double)num) > .8);
  }
}