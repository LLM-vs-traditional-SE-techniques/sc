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


public class CodexTest_0_2_6 { 
  @Test
  public void testGetAsInstanceShouldReturnInstanceWithValuesFromArray() {
    // given
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    Instances model = new Instances(new StringReader("@relation test\n"
        + "@attribute a numeric\n"
        + "@attribute b numeric\n"
        + "@attribute c numeric\n"
        + "@data\n"));
    // when
}