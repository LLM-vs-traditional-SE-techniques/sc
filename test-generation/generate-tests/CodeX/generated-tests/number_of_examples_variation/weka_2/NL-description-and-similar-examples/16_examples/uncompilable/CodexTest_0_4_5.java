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
  public void testInstance() {
    Random random = new Random(1);
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
								     "x,y,z\n"
								     + "N,N,N\n"
								     + "1.0,2.0,3.0\n"
								     + "4.0,5.0,6.0\n"
								     + "7.0,8.0,9.0\n"
								     + "10.0,11.0,12.0\n"
								     + "13.0,14.0,15.0\n"
								     + "16.0,17.0,18.0\n"
								     + "19.0,20.0,21.0\n"
								     + "22.0,23.0,24.0\n"
								     + "25.0,26.0,27.0\n"
								     )));
    model.setClassIndex(model.numAttributes() - 1);
    Instance newInst = v.getAsInstance(model, random);
    assertEquals("Length differs", model.numAttributes(), newInst.numAttributes());
    assertEquals("Datatypes are not compatible.", 2.3, newInst.value(0), 1.0e-12);
    assertEquals("Datatypes are not compatible.", 1.2, newInst.value(1), 1.0e-12);
    assertEquals("Datatypes are not compatible.", 5.0, newInst.value(2), 1.0e-12);
}