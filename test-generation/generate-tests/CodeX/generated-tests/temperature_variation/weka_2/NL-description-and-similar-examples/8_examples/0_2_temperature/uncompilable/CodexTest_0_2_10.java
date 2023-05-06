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


public class CodexTest_0_2_10 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 5;
    Random random = new Random(1);
    Instances insts = new Instances(new Instances(new StringReader(
								   "nom1,nom2,num1\n"
								   + "0,0,0\n"
								   + "0,1,1\n"
								   + "1,0,2\n"
								   + "1,1,3\n"
								   + "0,0,4\n"
								   + "0,1,5\n"
								   + "1,0,6\n"
								   + "1,1,7\n"
								   + "0,0,8\n"
								   + "0,1,9\n"
								   + "1,0,10\n"
								   + "1,1,11\n"
								   + "0,0,12\n"
								   + "0,1,13\n"
								   + "1,0,14\n"
								   + "1,1,15\n"
								   + "0,0,16\n"
								   + "0,1,17\n"
								   + "1,0,18\n"
								   + "1,1,19\n")));
    insts.setClassIndex(insts.
}