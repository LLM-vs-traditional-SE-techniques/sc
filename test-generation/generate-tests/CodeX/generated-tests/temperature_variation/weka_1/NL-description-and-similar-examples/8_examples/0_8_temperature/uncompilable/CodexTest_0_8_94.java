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


public class CodexTest_0_8_94 { 
  @Test
     public void testAddScalar() {
    AlgVector v1 = new AlgVector(data);
    AlgVector v2 = v1.add(2.0);
}