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


public class CodexTest_0_8_91 { 
  @Test
  public void testGetAsInstance() {
    int size = 7;
    String arff = "relation Dataset\n"
      + "\n"
      + "attribute A1 numeric\n"
      + "attribute A2 nominal {v1,v2,v3}\n"
      + "attribute A3 numeric\n"
      + "\n"
      + "data\n"
      + "\n"
      + "0.0\n"
      + "1.0\n"
      + "2.0\n"
      + "3.0\n"
      + "4.0\n"
      + "5.0\n"
      + "6.0\n";
    Instances data = new Instances(new StringReader(arff));
}