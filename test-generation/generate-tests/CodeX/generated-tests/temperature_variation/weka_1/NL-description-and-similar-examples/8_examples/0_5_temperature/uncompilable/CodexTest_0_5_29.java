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


public class CodexTest_0_5_29 { 
  @Test(expected = IllegalArgumentException.class)
  public void testAdd_whenAddingVectorsWithDifferentSizes_shouldThrowIllegalArgumentException() {
    // given
    AlgVector v1 = new AlgVector(new double[] {1});
    AlgVector v2 = new AlgVector(new double[] {1, 2});
}