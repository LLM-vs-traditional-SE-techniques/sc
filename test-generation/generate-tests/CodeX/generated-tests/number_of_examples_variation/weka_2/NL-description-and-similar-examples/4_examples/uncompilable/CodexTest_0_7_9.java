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


public class CodexTest_0_7_9 { 
  @Test
    public void testGetAsInstance() {
        int numAtts = 9;
        int numVals = 7;
        int numData = 4;
        Random random = new Random(1);
        Instances model = new Instances("instances", makeAttributes(numAtts, numVals), numData);
        AlgVector vec = new AlgVector(numData + 1);
        vec.getAsInstance(model, random);
}