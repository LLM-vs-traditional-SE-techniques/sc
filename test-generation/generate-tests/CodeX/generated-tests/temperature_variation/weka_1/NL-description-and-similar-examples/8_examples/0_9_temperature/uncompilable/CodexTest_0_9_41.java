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


public class CodexTest_0_9_41 { 
  @Test
  public void add_vectorIncompatibleSize() {
    AlgVector vector1 = new AlgVector(2);
    AlgVector vector2 = new AlgVector(2);
    Assert.assertNotSame(vector1, vector2);
    AlgVector result = vector1.add(vector2);
}