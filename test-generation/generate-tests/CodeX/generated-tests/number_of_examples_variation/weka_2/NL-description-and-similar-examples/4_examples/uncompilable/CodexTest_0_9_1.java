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


public class CodexTest_0_9_1 { 
  @Test
  public void testChangeValueWhenReadFromStream() throws Exception {
    JsonNode node = MAPPER.readTree("{\"test\": \"XYZ\"}");
    SimpleObject object = MAPPER.treeToValue(node, SimpleObject.class);
    String expected = "XYZ";
    assertEquals(expected, object.test);
  }
 
Input: public Instance getAsInstance(Instances model, Random random) 
    throws Exception {
    Instance newInst = null;
    if (m_Elements != null) {
      newInst = new DenseInstance(model.numAttributes());
      newInst.setDataset(model);
            for (int i = 0, j = 0; i < model.numAttributes(); i++) {
	if (model.attribute(i).isNumeric()) {
	  if (j >= m_Elements.length)
	    throw new Exception("Datatypes are not compatible."); 
	  newInst.setValue(i, m_Elements[j++]);
	}
	if (model.attribute(i).isNominal()) {
	  int newVal = (int) 
	    (random.nextDouble() * (double) (model.attribute(i).numValues()));
	  if (newVal == (int) model.attribute(i).numValues())
	    newVal -= 1;
	  newInst.setValue(i, newVal);
	}
      }
    }
    return newInst;
  }
Output:
    public void testSetElementsShouldThrowErrorWhenLengthIsGreaterThan1() throws Exception {
        // given
        Matrix A = Matrix.of(new double[][] { {2, 3, 4}, {5, 6, 7},{7,8,9}});
        // when
        try {
            A.setElements(0, new double[]{1, 2});
            fail("Exception should have been thrown");
        }
        // then
        catch (Exception e) {
            assertThat(e.getMessage(),equalTo("Length of row/column must be 1"));
        }

}