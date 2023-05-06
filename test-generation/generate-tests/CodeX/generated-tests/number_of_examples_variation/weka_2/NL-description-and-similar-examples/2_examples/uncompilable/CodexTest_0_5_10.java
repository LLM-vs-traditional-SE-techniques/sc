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


public class CodexTest_0_5_10 { 
  @Test
  public void testGetAsInstance1() {
    Instances model = new Instances(new BufferedReader(new StringReader(
																	   "@relation test\n" +
																	   "@attribute num1 numeric\n" +
																	   "@attribute num2 numeric\n" +
																	   "@attribute num3 numeric\n" +
																	   "@attribute num4 numeric\n" +
																	   "@attribute num5 numeric\n" +
																	   "@attribute num6 numeric\n" +
																	   "@attribute num7 numeric\n" +
																	   "@attribute num8 numeric\n" +
																	   "@
}