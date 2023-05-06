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


public class CodexTest_0_6_10 { 
  @Test
  public void testGetAsInstance() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    try {
      v.getAsInstance(null, null);
      fail("NullPointerException expected");
    }
    catch (NullPointerException e) {
      // OK
    }
    catch (Exception e) {
      fail("NullPointerException expected, but caught " + e.toString());
    }
  }
```
}