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


public class CodexTest_0_5_99 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
									"@relation test\n"+
									"@attribute a numeric\n"+
									"@attribute b numeric\n"+
									"@attribute c numeric\n"+
									"@attribute d numeric\n"+
									"@attribute e numeric\n"+
									"@attribute f numeric\n"+
									"@attribute g numeric\n"+
									"@data\n"+
									"1,2,3,4,5,6,7")));
    double[] data = {1,2,3,4,5,6,7};
    AlgVector v = new AlgVector(data);
    Instance i = v.getAsInstance(model, new Random(1));
    assertEquals("Datatypes are not compatible.", 7, i.numAttributes());
  }
}