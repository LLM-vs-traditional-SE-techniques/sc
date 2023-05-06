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


public class CodexTest_0_8_10 { 
  @Test
  @Override
  public void setValueAt(int row, int column, Object value) {
    if (row < 0 || column < 0 || row >= m_RowCount || column >= m_ColumnCount) {
      throw new IndexOutOfBoundsException();
    } else if (column == m_ColumnCount - 1) {
      m_RowCounts[row] = ((Integer) value).intValue();
    } else {
      m_Data[row][column] = (Object) value;
    }
  }
}