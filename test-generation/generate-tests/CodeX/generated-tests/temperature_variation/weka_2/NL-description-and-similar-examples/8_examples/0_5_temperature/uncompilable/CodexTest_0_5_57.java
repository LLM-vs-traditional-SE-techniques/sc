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


public class CodexTest_0_5_57 { 
  @Test
    public void testGetAsInstance() {
      Instances data = new Instances(m_Data);
      AlgVector v = new AlgVector(data.numAttributes());
      Instance inst = v.getAsInstance(data, new Random(0));
      assertEquals("Datatypes are not compatible.", data.numAttributes(),
		   inst.numAttributes());
    }
}