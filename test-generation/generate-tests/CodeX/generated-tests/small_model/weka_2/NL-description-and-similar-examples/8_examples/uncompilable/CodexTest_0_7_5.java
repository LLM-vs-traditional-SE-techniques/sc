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


public class CodexTest_0_7_5 { 
  @Test
  public void testGetAsInstanceShouldThrowExceptionWhenDatatypesIncompatible() {
    Instance newInst = null;
    try {
      newInst = m_Elements.getAsInstance(m_Model, m_Random);
    } catch (Exception e) {
      assertThat(e, is(instanceOf(RuntimeException.class)));
    }
  }
Output:
  public void testGetAsInstanceShouldReturnInstanceWhenDatatypesCompatible() {
    Inst
}