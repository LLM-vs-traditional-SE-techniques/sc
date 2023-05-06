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


public class CodexTest_0_8_9 { 
  @Test
  public static void testrandom() {
    double[] array = new double[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }
    AlgVector vector = new AlgVector(array);
    vector.getAsInstance(null, null);
  }
}