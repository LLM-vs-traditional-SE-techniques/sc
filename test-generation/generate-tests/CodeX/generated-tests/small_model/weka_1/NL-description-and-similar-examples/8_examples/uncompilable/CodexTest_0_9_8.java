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


public class CodexTest_0_9_8 { 
  @Test
  public void equalsTest2() {
    AlgVector v3 = new AlgVector(2);
    AlgVector v4 = new AlgVector(2);
    v3.m_Elements[0] = 1.;
    v3.m_Elements[1] = 2.;
    v4.m_Elements[0] = 1.;
    v4.m_Elements[1] = 2.;
}