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


public class CodexTest_0_5_25 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(new StringReader(
	"@relation InstanceTest\n"
	+ "@attribute numeric numeric\n"
	+ "@attribute nominal {a,b,c}\n"
	+ "@data\n"
	+ "1.0,a\n"
	+ "2.0,b\n"
	+ "3.0,c\n"
	+ "4.0,a\n"
	+ "5.0,b\n"
	+ "6.0,c\n"
	+ "7.0,a\n"
	+ "8.0,b\n"
	+ "9.0,c\n"
	+ "10.0,a\n"
	+ "11.0,b\n"
	+ "12.0,c\n"
	+ "13.0,a\n"
	+ "14.0,b\n"
	+ "15.0,c\n"
	+ "16.0,a\n"
	+ "17.0,b\n"
	+ "18.0,c\n"
	+ "19.0,a\n"
	+ "20.0,b\n"
	+ "21.0,c\n"
	+ "22.0,a\n"
	+ "23.0,b\n"
	+ "24.0,c\n"
	+ "25.0,a\n"
	+ "26.0,b\n"
	+ "27.0,c\n"
	+ "28.0,a\n"
	+ "29.0,b\n"
	+ "30.0,c\n"
	+ "31.0,a\n"
	+ "32.0,b\n"
	+ "33.0,c\n"
	+ "34.0,a\n"
	+ "35.0,b\n"
	+ "36
}