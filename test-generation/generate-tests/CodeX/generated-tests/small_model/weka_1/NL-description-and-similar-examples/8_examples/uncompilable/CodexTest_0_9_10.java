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


public class CodexTest_0_9_10 { 
    @Test
    public void testAdd() {
        AlgVector v1 = new AlgVector(2);
        v1.setElement(0, 1.5);
        AlgVector v2 = new AlgVector(v1);
}