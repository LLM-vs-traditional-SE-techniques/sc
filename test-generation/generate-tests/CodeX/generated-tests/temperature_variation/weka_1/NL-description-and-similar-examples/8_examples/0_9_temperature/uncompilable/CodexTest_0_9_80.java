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


public class CodexTest_0_9_80 { 
  @Test
  public void testAdd(){
      int len = 3;
      AlgVector v1 = new AlgVector(len);
      AlgVector v2 = new AlgVector(len);
      for (int i = 0; i < v1.numElements(); i++) {
        v1.setElement(i,i);
      }
      for (int i = 0; i < v2.numElements(); i++) {
        v2.setElement(i,i);
      }
}