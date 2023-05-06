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


public class CodexTest_0_8_69 { 
  @Test
    public void testCovarianceNumeric() {
        Instances data = getData();
        for (int i = 0; i < data.numAttributes(); i++) {
            if (data.attribute(i).isNumeric()) {
                double cov = m_AttributeStats[i].numericStats.cov;
                double att1Mean = m_AttributeStats[i].numericStats.mean;
                double att2Mean = m_AttributeStats[j].numericStats.mean;
                double totalCov = 0;
                for (int k = 0; k < data.numInstances(); k++) {
                    Instance inst = data.instance(k);
                    double att1Val = inst.value(i);
                    double att2Val = inst.value(j);
                    totalCov += (att1Val - att1Mean) * (att2Val - att2Mean);
                }
                assertEquals(cov, totalCov / (data.numInstances() - 1), 1e-6);
            }
        }
    }
}