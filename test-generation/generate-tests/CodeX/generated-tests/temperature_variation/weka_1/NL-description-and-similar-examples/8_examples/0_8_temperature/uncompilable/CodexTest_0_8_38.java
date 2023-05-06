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


public class CodexTest_0_8_38 { 
  @Test
  public void testAdd() {
    AlgVector y = this.v.add(this.y);
    assertTrue(y.toString(), y.equals(new AlgVector(this.yDouble)));
  }
}