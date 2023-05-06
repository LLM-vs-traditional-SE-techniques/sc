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


public class CodexTest_0_6_8 { 
    @Test
    public void test_getAsInstance_NominalAndNumeric() throws Exception {
        // given
        Random random = new Random(1);
        Instances model = createModel(new String[] {"numeric", "nominal"},
                new String[][] {{"0", "1"}, {"a", "b"}});
        AlgVector vector = new AlgVector(new double[] {1, 2});
        // when
        Instance instance = vector.getAsInstance(model, random);
        // then
        assertEquals(1, instance.value(0), 0.0);
        assertEquals(1, instance.value(1), 0.0);
    }
}