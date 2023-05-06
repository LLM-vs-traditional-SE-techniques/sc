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


public class CodexTest_0_7_7 { 
  @Test
    public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = null;
    Random random = RandomUtils.getRandom();
    try{
      Instance instance = v.getAsInstance(model,random);
    }catch(Exception ex){
      fail(ex.getMessage());
    }
  }
}