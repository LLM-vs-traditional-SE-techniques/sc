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


public class CodexTest_0_9_8 { 
  @Test
  public class TestInstanceGeneration extends TestCase {
	  private Instances empty;
	  private Instances oneNom;
	  private Instances oneNomVal;
	  private Instances oneNum;
	  private Instances oneNomOneNum;
	  private Instances oneNomValOneNomOneNum;
	  private Instances oneNomValTwoNum;
	  private Instances twoNom;
	  private Instances twoNomValFourNum;
	  private Random random; 
	  
	  public void setUp() {
	    random = new Random(42);
	    empty = new Instances(new BufferedReader(new StringReader(
		      "@relation null.null\n" + 
		      "@attribute test numeric\n" +
		      "@attribute class numeric\n" +
		      "@data\n" +
		      "1.0,1.0\n" +
		      "2.0,2.0\n" +
		      "3.0,3.0\n")));
	    empty = empty.attribute(0).relation();
	    oneNom = new Instances(new BufferedReader(new StringReader(
		    "@relation null.null\
}