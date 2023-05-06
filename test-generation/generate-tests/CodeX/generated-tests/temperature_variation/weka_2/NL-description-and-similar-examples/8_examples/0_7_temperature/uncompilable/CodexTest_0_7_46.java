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


public class CodexTest_0_7_46 { 
    @Test
    public void testClassifyInstance() throws Exception {
        DataSet dataSet = TestDataSet.generateDataSet("test", 100, 0, 13);
        AlgVector algVector = AlgVector.createAlgVector(dataSet.getDataRow(0));
        algVector.classifyInstance(dataSet,new Random());
}