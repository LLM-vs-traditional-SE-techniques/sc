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


public class CodexTest_0_4_86 { 
  @Test
    public void testGetAsInstance() {
    double[] data = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new BufferedReader(new StringReader(
																	   "@@RELATION test\n" +
																	   "@ATTRIBUTE a NUMERIC\n" +
																	   "@ATTRIBUTE b NUMERIC\n" +
																	   "@ATTRIBUTE c NUMERIC\n" +
																	   "@ATTRIBUTE d NUMERIC\n" +
																	   "@ATTRIBUTE e NUMERIC\n" +
																	   "@ATTRIBUTE f NUMERIC\n" +
																	   "@ATTRIBUTE g {a,b,c}\n" +
																	   "@ATTRIBUTE h {a,b,c}\n" +
																	   "@ATTRIBUTE i {a,b,c}\n" +
																	   "@ATTRIBUTE j {a,b,c}\n" +
																	   "@ATTRIBUTE k {a,b,c}\n" +
																	   "@ATTRIBUTE l {a,b,c}\
}