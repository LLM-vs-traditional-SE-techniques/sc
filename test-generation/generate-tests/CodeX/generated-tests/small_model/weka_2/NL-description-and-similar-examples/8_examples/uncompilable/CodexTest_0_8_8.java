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


public class CodexTest_0_8_8 { 
  @Test
  public void testGetAsInstanceShouldReturnNewInstanceWithRandomValues()
    throws Exception {
    AlgVector old = new AlgVector();
    old.m_Elements = new double[3];
    Arrays.fill(old.m_Elements, 1.5);
    Random r = new Random(1);
}