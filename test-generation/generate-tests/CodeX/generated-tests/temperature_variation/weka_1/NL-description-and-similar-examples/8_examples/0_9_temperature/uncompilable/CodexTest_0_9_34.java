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


public class CodexTest_0_9_34 { 
  @Test
  public void testAdd_ScalarTimesAlgVector() {
    AlgVector a1 = new AlgVector(new double[]{2., 3., 4., 5.});
    AlgVector a2 = (AlgVector)a1.times(3.);
}