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


public class CodexTest_0_9_37 { 
    @Test
    public void testSetDataset3() throws Exception {
        DataSource source = new DataSource(
            "core/src/test/resources/weka/core/matrix/TestDenseInstance.arff");
        Instances instances = source.getDataSet();
        instances.setClassIndex(instances.numAttributes() - 1);
        
        m_Tester = new DenseInstance(instances.numAttributes());
        m_Tester.setDataset(instances);
        assertEquals(
            "Test for set dataset method failed on 0th index",
            0.5, m_Tester.value(0), PRECISION);
    }
}