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


public class CodexTest_0_8_44 { 
    @Test(expected = IllegalArgumentException.class)
      public void shouldNotAcceptNullVector(){
	AlgVector vector = new AlgVector(new double[]{1,2,3});
        AlgVector other = null;
        vector.add(other);
      }
}