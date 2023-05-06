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


public class CodexTest_0_5_84 { 
  @Test
    public void testGetAsInstance() throws Exception {
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation Test\n"
							+ "@attribute a numeric\n"
							+ "@attribute b numeric\n"
							+ "@attribute c numeric\n"
							+ "@attribute d numeric\n"
							+ "@attribute e numeric\n"
							+ "@data\n"
							+ "0,1,2,3,4\n"
							+ "1,2,3,4,5\n"
							+ "2,3,4,5,6\n"
							+ "3,4,5,6,7\n"
							+ "4,5,6,7,8\n"
							+ "5,6,7,8,9\n"
							+ "6,7,8,9,10\n"
							+ "7,8,9,10,11\n"
							+ "8,9,10,11,12\n"
							+ "9,10,11,12,13\n"
							+ "10,11,12,13,14\n"
							+ "11,12,13,14,15\n"
							+ "12,13,14,15,16\n"
							+ "13,14,15,16,17\n"
							+ "14,15,16,17,18\n"
							+ "15,16,17,18,19\n"
						
}