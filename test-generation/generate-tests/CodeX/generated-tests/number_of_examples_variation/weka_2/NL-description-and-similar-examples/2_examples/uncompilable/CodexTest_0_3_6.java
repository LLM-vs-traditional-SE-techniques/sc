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


public class CodexTest_0_3_6 { 
  @Test
  public void testGetAsInstance() {
    try {
      AlgVector v = new AlgVector(new double[]{1.0, 2.0});
      Instances model = new Instances(new BufferedReader(
				       new StringReader(
					 "X,Y\n" +
					 "1.0,2.0\n" +
					 "3.0,4.0\n" +
					 "5.0,6.0\n" +
					 "7.0,8.0\n" +
					 "9.0,10.0\n" +
					 "11.0,12.0\n" +
					 "13.0,14.0\n" +
					 "15.0,16.0\n" +
					 "17.0,18.0\n" +
					 "19.0,20.0\n" +
					 "21.0,22.0\n" +
					 "23.0,24.0\n" +
					 "25
}