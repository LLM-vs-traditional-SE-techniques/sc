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


public class CodexTest_0_2_4 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "@RELATION test\n" +
									  "@ATTRIBUTE a NUMERIC\n" +
									  "@ATTRIBUTE b NUMERIC\n" +
									  "@ATTRIBUTE c NUMERIC\n" +
									  "@ATTRIBUTE d NUMERIC\n" +
									  "@ATTRIBUTE e NUMERIC\n" +
									  "@ATTRIBUTE f NUMERIC\n" +
									  "@ATTRIBUTE g NUMERIC\n" +
									  "@ATTRIBUTE h NUMERIC\n" +
									  "@ATTRIBUTE i NUMERIC\n" +
			
}