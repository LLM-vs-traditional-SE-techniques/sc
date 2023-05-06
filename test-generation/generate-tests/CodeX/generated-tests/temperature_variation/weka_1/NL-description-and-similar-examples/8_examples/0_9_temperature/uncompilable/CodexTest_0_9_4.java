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


public class CodexTest_0_9_4 { 
  @Test
        public void addAssignTest() {
            // Example from here: http://stackoverflow.com/questions/20098363/using-smaa-sharpdx-to-draw-text
            // Setup
            AlgVector v1 = new AlgVector(15, 12, 8);
            AlgVector v2 = new AlgVector(8, 16, 13);
            // Test
            AlgVector actual = v1.add(v2);
            AlgVector expected = new AlgVector(23, 28, 21);
            // Verify
            assertEquals(expected, actual);
        }
}