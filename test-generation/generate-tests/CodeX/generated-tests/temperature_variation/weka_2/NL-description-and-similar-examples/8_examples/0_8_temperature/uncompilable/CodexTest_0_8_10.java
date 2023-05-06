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


public class CodexTest_0_8_10 { 
  @Test
    assertThrows(Exception.class, () -> {
      AlgVector v = new AlgVector(new double[] {1.09, 2.9, 3.9});
      v.getAsInstance(null, null);
    });
}