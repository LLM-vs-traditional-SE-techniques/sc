import cern.colt.matrix.*;
import cern.colt.list.DoubleArrayList;
import cern.colt.list.IntArrayList;
import cern.colt.matrix.impl.AbstractMatrix1D;

import hep.aida.bin.*;
import cern.colt.matrix.impl.*;
import cern.colt.function.DoubleDoubleFunction;
import cern.colt.function.DoubleFunction;
import cern.colt.list.IntArrayList;
import cern.colt.map.AbstractIntDoubleMap;
import cern.colt.map.OpenIntDoubleHashMap;
import cern.colt.matrix.DoubleFactory2D;
import cern.colt.matrix.DoubleMatrix1D;
import cern.colt.matrix.DoubleMatrix2D;
import cern.colt.matrix.DoubleMatrix3D;
import cern.colt.matrix.doublealgo.DoubleMatrix2DComparator;
import cern.colt.matrix.linalg.Algebra;
import cern.colt.matrix.linalg.LUDecompositionQuick;
import cern.colt.matrix.linalg.SeqBlas;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_39 { 
  @Test
  private void testAssignMatrixList(IntegerMatrix2D matrix, List list) {
    matrix.assign(list);
    Iterator it = list.iterator();
    int rows = matrix.rows();
    int columns = matrix.columns();
    for (int column=columns; --column >=0; ) {
      for (int row=rows; --row >=0; ) {
        assertEquals("Matrix.assign(list), row="+row+" column="+column,it.next(),matrix.getQuick(row,column));
      }
    }
  }
Input: public IndexRequest opType(String opType) {
        String op = opType.toLowerCase(Locale.ROOT);
        if (op.equals("create")) {
            opType(OpType.CREATE);
        } else if (op.equals("index")) {
            opType(OpType.INDEX);
        } else {
            throw new IllegalArgumentException("opType must be create or index, found: [" + opType + "]");
        }
        return this;
    }
Output: public void testReadBogusString() {
        try {
            IndexRequest indexRequest = new IndexRequest("");
            indexRequest.opType("foobar");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), equalTo("opType must be create or index, found: [foobar]"));
        }    }
}