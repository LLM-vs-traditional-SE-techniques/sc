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


public class CodexTest_0_9_91 { 
  @Test
public void InstancegetAsInstanceTest() {
    AlgVector m_Elements_14=AlgVector.vector(14);
    assertEquals(14, m_Elements_14.getElement(13), 0);
}
}