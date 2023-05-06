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


public class CodexTest_0_7_95 { 
    @Test
    public void testNominalAttribute() throws Exception {
        // given
        Instances model = createModelWithNominalAttribute();
        AlgVector vector = new AlgVector(new double[]{1.0, 2.0, 3.0});
}