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


public class CodexTest_0_9_2 { 
    @Test(expected = Exception.class)
    public void testGetInstanceWithDifferentDataset() throws Exception {
        AlgorithmVector input = new AlgorithmVector(new Double[] {0.0, 0.1});
        AlgVector v = new AlgVector(input);
        Random random = new Random(0);
        Instances model = new Instances("Test", 
                new Attribute[] {
                    new Attribute("Attr1"),
                    new Attribute("Att
}