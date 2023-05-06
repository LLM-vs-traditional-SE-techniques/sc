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


public class CodexTest_0_8_6 { 
  @Test
  public void testBasicAttributeChooser() {
    int[] attList = m_AttributeChooser.m_SelectedAttributes;
    // test if all attributes are in the list
    for (int i = 0; i < attList.length; i++) {
      boolean found = false;
      for (int j = 0; j < m_AttributeChooser.m_SelectedAttributes.length; j++) {
	if (attList[i] == j) {
	  found = true;
	  break;
	}
      }
      assertTrue(found);
    }
  }
}