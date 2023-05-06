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


public class CodexTest_0_7_8 { 
  @Test
    public void testGetAsInstance() {
    int numAttributes = 4;
    double[] values = {1.0, 2.0, 3.0, 4.0};
    Random random = RandomUtils.getRandom();
    AlgVector vector = new AlgVector(values);
}