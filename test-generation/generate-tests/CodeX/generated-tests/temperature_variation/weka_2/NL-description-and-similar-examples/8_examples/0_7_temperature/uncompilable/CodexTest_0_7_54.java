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


public class CodexTest_0_7_54 { 
  @Test
    public boolean addInstance(Instance instance) {
    boolean result = true;
    for (int i = 0; i < m_Elements.length; i++) {
      if (m_Elements[i] != instance.value(i)) {
	result = false;
	break;
      }
    }
    return result;
  }
}