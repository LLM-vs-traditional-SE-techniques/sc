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


public class CodexTest_0_6_4 { 
  @Test
    public void testGetAsInstanceShouldReturnNullIfNoData() {
        // given
        AlgVector vector = new AlgVector();
        Instances insts = TestUtils.createInstances();
        // when
        Instance result = vector.getAsInstance(insts, new Random(0));
        // then
        assertNull(result);
    }
}