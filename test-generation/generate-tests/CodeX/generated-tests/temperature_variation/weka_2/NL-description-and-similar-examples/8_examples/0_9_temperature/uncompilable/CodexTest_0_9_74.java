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


public class CodexTest_0_9_74 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(m_MissingValuesTestSet);
    model.setClassIndex(1);
    Instance inst = new Instance(m_MissingValuesTestSet.numAttributes());
    int x = 0;
    while (x < inst.numAttributes()) {
      Attribute attr = inst.attribute(x);
      if (x % 2 == 0) {
	inst.setValue(x, Utils.missingValue());
      }
      else {
	if (attr.isNominal()) {
	  inst.setValue(x, 4);
	}
	else {
	  inst.setValue(x, 1);
	}
      }
      x++;
    }
    inst.setDataset(model);
    assertNotNull(inst.getAsInstance(true, 1.0));
  }
}