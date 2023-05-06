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


public class CodexTest_0_8_20 { 
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        AlgVector algVector = new AlgVector(6);
        AlgVector algVector2 = new AlgVector(3);
        AlgVector result = algVector.add(algVector2);
    }
}