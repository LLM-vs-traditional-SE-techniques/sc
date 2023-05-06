import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_13 { 
  @Test
        // TODO: test this (maybe in isolation)
        final public void testFromString() {
            throw new UnsupportedOperationException("Not yet implemented");
        }
*/
        /*
Input: public int getNumColumns() {
      return m_Cols;
  }
Output: public void testGetNumColumns() {
      int numCols = 5;
      AlgMatrix sm = new AlgMatrix(m_Rows, numCols);
      Matrix smm = new SimpleMatrix(m_Rows, numCols);
      assertEquals(numCols, sm.getNumColumns());
      assertEquals(smm.numCols(), sm.getNumColumns());
  }
}