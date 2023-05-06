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


public class CodexTest_0_8_82 { 
  @Test
    public void testImputationOfMissingValue() {
        Instances data = null;
        try {
            data = DataSource.read(
                    "weka/filters/data/nominalMissing.arff");
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("Problem reading data");
        }
        data.setClassIndex(data.numAttributes() - 1);
}