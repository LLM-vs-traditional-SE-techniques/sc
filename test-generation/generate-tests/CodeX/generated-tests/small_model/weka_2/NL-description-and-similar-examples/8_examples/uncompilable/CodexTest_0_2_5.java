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


public class CodexTest_0_2_5 { 
  @Test
    public void testGetAsInstanceShouldReturnNullIfElementsIsNull() {
        // given
        AlgVector vector = new AlgVector(null);
        // when
        Instance result = vector.getAsInstance(new DenseInstance(0));
        // then
        assertNull(result);
    }
}