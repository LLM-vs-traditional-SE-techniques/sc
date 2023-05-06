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


public class CodexTest_0_8_65 { 
  @Test
  public void testAdd() throws Exception {
    AlgVector a = new AlgVector(1.0, 2.0, 3.0);
    AlgVector b = new AlgVector(3.0, 2.0, 1.0);
    AlgVector c = (AlgVector)a.add(b);
    AlgVector d = new AlgVector(4.0, 4.0, 4.0);
}