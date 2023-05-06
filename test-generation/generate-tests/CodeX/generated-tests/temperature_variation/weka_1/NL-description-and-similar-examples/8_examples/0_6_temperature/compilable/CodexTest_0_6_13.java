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


public class CodexTest_0_6_13 { 
    @Test(expected = NullPointerException.class)
    public void testAdditionOfTwoNullVectors() {
        // given
        AlgVector vector1 = null;
        AlgVector vector2 = null;
        // when
        AlgVector vector3 = vector1.add(vector2);
    }
}