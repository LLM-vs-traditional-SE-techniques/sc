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


public class CodexTest_0_6_4 { 
  @Test
  public void testGetAsInstance() {
    int numAtt = 3;
    int numVal = 4;
    int numInst = 7;
    int numElem = numAtt - numVal;
    int val = numVal / 2;
    int[] attVals = new int[numVal];
    for (int i = 0; i < numVal; i++)
      attVals[i] = i;
    double[] elems = new double[numElem];
    for (int i = 0; i < numElem; i++)
      elems[i] = i;
}