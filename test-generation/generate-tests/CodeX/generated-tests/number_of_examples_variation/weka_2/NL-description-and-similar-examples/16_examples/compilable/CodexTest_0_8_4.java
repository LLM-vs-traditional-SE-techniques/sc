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


public class CodexTest_0_8_4 { 
    @Test
  public void testGetDescriptiveName() {
    AlgVector vector = new AlgVector(3);
    String description = vector.toString();
    assertTrue("Descriptive name of vector is incorrect: " + description, description.equals("1.0,2.0,3.0"));
  }
}