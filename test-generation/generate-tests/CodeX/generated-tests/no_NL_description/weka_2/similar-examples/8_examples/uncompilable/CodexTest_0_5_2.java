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


public class CodexTest_0_5_2 { 
  @Test
  public void testGetAsInstance() {
    Instances inst = new Instances(new BufferedReader(new StringReader(
																	   "A,B,C,D\n" +
																	   "1,2,3,4\n" +
																	   "5,6,7,8\n")));
    inst.setClassIndex(3);
    double[] values = {1, 2, 3, 4};
    Instance inst2 = new DenseInstance(1, values);
    inst.add(inst2);
    double[] values2 = {5, 6, 7, 8};
    Instance inst3 = new DenseInstance(1, values2);
    inst.add(inst3);
    double[] values3 = {9, 10, 11, 12};
    Instance inst4 = new DenseInstance(1, values3);
    inst.add(inst4);
    double[] values4 = {13, 14, 15, 16};
    Instance inst5 = new DenseInstance(1, values4);
    inst.add(inst5);
    double[] values5 = {17, 18, 19, 20};
    Instance inst6 = new DenseInstance(1, values5);
    inst.add(inst6);
    double[] values6 = {21, 22, 23, 24};
    Instance inst7 = new DenseInstance(1, values6);
    inst.add(inst7);
    double[] values7 = {25, 26, 27, 28};
    Instance inst8 = new DenseInstance(1, values7);
    inst.add(inst8);
    double[] values8 = {29, 30, 31, 32};
    Instance inst9 = new DenseInstance(1, values8);
    inst.add(inst9);
    double[] values9 = {33, 34, 35, 36};
    Instance inst10 = new DenseInstance(1, values9);
   
}