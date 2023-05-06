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


public class CodexTest_0_3_3 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
									  "a,b,c,d,e,f\n" +
									  "1,1,1,1,1,1\n" +
									  "2,2,2,2,2,2\n" +
									  "3,3,3,3,3,3\n" +
									  "4,4,4,4,4,4\n" +
									  "5,5,5,5,5,5\n" +
									  "6,6,6,6,6,6\n" +
									  "7,7,7,7,7,7\n" +
									  "8,8,8,8,8,8\n" +
									  "9,9,9,9,9,9\n
}