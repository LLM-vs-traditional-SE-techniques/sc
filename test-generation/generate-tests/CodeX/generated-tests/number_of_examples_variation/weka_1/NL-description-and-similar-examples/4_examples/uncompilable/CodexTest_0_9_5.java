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


public class CodexTest_0_9_5 { 
  @Test
  public void testAdd(){
    int len = 22;
    AlgVector w = new AlgVector(len);
    AlgVector v = new AlgVector(len);
    assertEquals(len, v.add(w).m_Elements.length);
}