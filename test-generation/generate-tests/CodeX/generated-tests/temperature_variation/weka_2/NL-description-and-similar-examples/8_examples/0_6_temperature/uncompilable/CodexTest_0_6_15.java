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


public class CodexTest_0_6_15 { 
  @Test
  public void testGetAsInstance() throws Exception {
    // create the instances
    Instances insts = new Instances(new StringReader(
						      "a,b,c,d\n"
						      + "0.0,1.1,2.2,3.3\n"
						      + "4.4,5.5,6.6,7.7\n"
						      + "8.8,9.9,10.0,11.1\n"));
    insts.setClassIndex(insts.numAttributes() - 1);
}