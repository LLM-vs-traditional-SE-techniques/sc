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


public class CodexTest_0_1_14 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numVals = 2;
    int numInsts = 10;
    int numTests = 10;
    Random random = new Random(1);
    Instances insts = new Instances(new BufferedReader(new StringReader(
									"\n@relation test\n"
									+ "\n@attribute a numeric\n"
									+ "\n@attribute b numeric\n"
									+ "\n@attribute c {0,1}\n"
									+ "\n@data\n"
									+ "\n0.0,0.0,0\n"
									+ "\n1.0,1.0,1\n"
									+ "\n2.0,2.0,0\n"
									+ "\n3.0,3.0,1\n"
									+ "\n4.0,4.0,0\n"
									+ "\n5.0,5.0,1\n"
									+ "\n6.0,6.0,0\n"
									+ "\n7.0,7.0,1\n"
									+ "\n8.0,8.0,0\n"
									+ "\n9.0,9.0,1\n")));
    insts.setClassIndex(insts.numAttributes() - 1);
    AlgVector v = new AlgVector(numAtts);
    for (int i = 0; i < numTests; i++) {
      Instance inst = v.getAsInstance(insts, random);
      assertEquals
}