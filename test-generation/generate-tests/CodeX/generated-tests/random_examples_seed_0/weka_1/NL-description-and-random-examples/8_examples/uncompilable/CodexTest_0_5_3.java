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


public class CodexTest_0_5_3 { 
  @Test
    public void testAddShouldReturnNullWhenNullGiven() {
        // given
        AlgVector underTest = new AlgVector();
        // when
        AlgVector result = underTest.add(null);
        // then
        assertNull(result);
    }
}