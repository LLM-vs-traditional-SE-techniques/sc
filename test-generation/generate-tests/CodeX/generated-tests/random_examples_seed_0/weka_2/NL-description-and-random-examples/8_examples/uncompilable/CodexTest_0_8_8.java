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


public class CodexTest_0_8_8 { 
    @Test
    public void buildDecisionTree_nominalSplit() throws Exception {
        Random random = new Random();
        random.setSeed(1);
        Instances data = DataFactory.createDataForNominalAttributeWithNumericClass();
        GiniSplitCrit splitCrit = new GiniSplitCrit();
        DecisionTree tree = new DecisionTree();
        tree.setSplitCriteria(splitCrit);
        tree.buildClassifier(data);
        Instances testData = DataFactory.createTestDataForNominalAttributeWithNumericClass();
        double actual = tree.classifyInstance(testData.get(0));
        assertEquals(1.0, actual, DELTA);
    }
}