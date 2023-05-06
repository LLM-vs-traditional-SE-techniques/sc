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


public class CodexTest_0_7_88 { 
  @Test
    public void testGeneration() {
        try {
            int numAtts = 5;
            int numVals = 4;
            FastVector atts = new FastVector(numAtts);
            for (int i = 0; i < numAtts; i++) {
                FastVector vals = new FastVector(numVals);
                for (int j = 0; j < numVals; j++) {
                    vals.addElement("val" + (j + 1));
                }
                atts.addElement(new Attribute("att" + (i + 1), vals));
            }
            Instances monster = new Instances("monster", atts, 0);
            AlgVector vec = new AlgVector(monster.numAttributes());
}