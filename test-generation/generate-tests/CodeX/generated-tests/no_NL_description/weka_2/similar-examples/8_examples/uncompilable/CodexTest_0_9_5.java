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
    public void testGetInstance() {
    int numInstances = 909;
    int numAttributes = 49; 
    int numElements = 8; 
    int instanceNumElements = 6;
    int seed = 7;
    DenseVector v = new DenseVector(numElements);
    v.setElements(m_Elements);
    Instance expectedInstance = m_Instance;
    Instances model = new Instances(createSimpleDataset(numInstances, 
							numAttributes, seed));
    try {
      Random random = new Random(seed);
      Instance newInst = v.getAsInstance(model, random);
      assertTrue("Datatypes are not compatible.",
		 expectedInstance.equalHeaders(newInst));
      assertTrue("Instance is not the same.", 
		 expectedInstance.equalValues(newInst));
    }
    catch(Exception ex) { 
      fail("Exception while getting instance.");
    }
  }
  
Input: @Override
		public Number getFromResultSet(ResultSet rs, int colIndex,
				SessionFactoryImplementor factory)
				throws SQLException {
			return rs.getByte( colIndex );
		}
Output: @Test
		public void testGetUnsignedTinyIntFromResultSet() {
			// given
			ResultSet rs = mock( ResultSet.class );
			byte expected = Byte.MAX_VALUE;
			given( rs.getByte( COLUMN_INDEX ) ).willReturn( expected );
}