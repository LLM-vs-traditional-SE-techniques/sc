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


public class CodexTest_0_7_48 { 
  @Test(expected = NullPointerException.class)
  public void add_whenOtherIsNull_thenExceptionIsThrown() {
    // given
    AlgVector v = new AlgVector(new double[]{1, 1});
}