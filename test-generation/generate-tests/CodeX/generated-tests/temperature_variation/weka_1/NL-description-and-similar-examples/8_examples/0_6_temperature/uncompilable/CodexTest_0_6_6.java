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


public class CodexTest_0_6_6 { 
  @Test
  public void testAdd_whenBothVectorsHaveSameLength() {
    // given
    double[] data1 = {1.0, 2.0};
    double[] data2 = {2.0, 3.0};
    AlgVector vector1 = new AlgVector(data1);
    AlgVector vector2 = new AlgVector(data2);
}