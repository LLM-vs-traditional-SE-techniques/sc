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


public class CodexTest_0_1_1 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c\n" + "1,2,3\n" + "4,5,6\n" + "7,8,9\n")));
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
        assertEquals(newInst, getAsInstance(model, random));
    }
}