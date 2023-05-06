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


public class CodexTest_0_9_4 { 
  @Test
  public void testGetAsInstance() {
     double[] data = {2.3, 1.2};
      AlgVector v = new AlgVector(data);
      v.getAsInstance();
    }
```
}