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


public class CodexTest_0_9_36 { 
  @Test
  public void testGetAsInstance() throws Exception {
    // Create attribute types and the algorithm instance.
    ArrayList<Attribute> atts = new ArrayList<Attribute>();
    atts.add(new Attribute("num"));
    atts.add(new Attribute("nom", new ArrayList<String>(Arrays.asList("no", "yes"))));
    Instances dataset = new Instances("test", atts, 0);
    Random r = new Random();
    r.seed(42);
    AlgVector v = new AlgVector(new double[]{42});
    // Test the transduction.
    Instance result = v.getAsInstance(dataset, r);
    assertEquals("Wrong number of attributes", result.numAttributes(), 2);
    assertEquals("Wrong numeric attribute", result.value(0), 42.0, EPSILON);
    assertEquals("Wrong nominal attribute", result.stringValue(1), "yes");
  }
```
}