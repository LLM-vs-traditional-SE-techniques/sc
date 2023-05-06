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


public class CodexTest_0_3_12 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 3;
    int numInst = 10;
    int numNom = 1;
    int numNum = 2;
    int numVal = 3;
    int numClass = 2;
    int numInstPerClass = 5;
    int numInstPerVal = 2;
    int numInstPerNum = 5;
    int numInstPerNom = 5;
    Random random = new Random(1);
    Instances data = new Instances(new BufferedReader(new StringReader(
								       "A,B,C\n"
								       +"1,2,3\n"
								       +"4,5,6\n"
								       +"7,8,9\n"
								       +"10,11,12\n"
								       +"13,14,15\n"
								       +"16,17,18\n"
								       +"19,20,21\n"
								       +"22,23,24\n"
								       +"25,26,27\n"
								       +"28,29,30\n")));
    data.setClassIndex(data.numAttributes() - 1);
    double[] values = new double[numNum];
    for (int i = 0; i < numNum; i++) {
      values[i] = random.nextDouble();
    }
    AlgVector v = new AlgVector(values);
    Instance inst = v.getAsInstance(data, random);
    assertEquals("Number of attributes incorrect", numAtt, inst.numAttributes());
    assertEquals("Number of values incorrect", numNum, inst.numValues());
    for (int i = 0; i < numNum; i++) {
      assertEquals("N
}