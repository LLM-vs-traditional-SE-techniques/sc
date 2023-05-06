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


public class CodexTest_0_5_84 { 
  @Test
  public void testAdd_whenAddingTwoNonEmptyVectors_thenResultIsCorrect() {
    // given
    AlgVector v1 = new AlgVector(2);
    v1.setElement(0, 1);
    v1.setElement(1, 2);
}