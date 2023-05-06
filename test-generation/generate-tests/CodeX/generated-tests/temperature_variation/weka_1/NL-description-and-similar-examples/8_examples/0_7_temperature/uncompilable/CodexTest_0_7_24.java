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


public class CodexTest_0_7_24 { 
  @Test
    public void testAdd_whenAddingTwoVectorOfDifferentSize_shouldThrowException() {
        // given
        AlgVector vector1 = new AlgVector(Arrays.asList(10.0, 20.0));
        AlgVector vector2 = new AlgVector(Arrays.asList(10.0, 20.0, 30.0));
        // then
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Vectors are not of the same size.");
        // when
        vector1.add(vector2);
    }
}