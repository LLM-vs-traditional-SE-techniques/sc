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


public class CodexTest_0_6_65 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(new StringReader(
								      "Name,Grade\n" +
								      "Joe,2\n" +
								      "Bob,1\n" +
								      "Charlie,3")));
    data.setClassIndex(1);
    AlgVector vec = new AlgVector(2);
    vec.setElement(0, 1.0);
    vec.setElement(1, 0.0);
}