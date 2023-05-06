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


public class CodexTest_0_8_96 { 
  @Test
  public void testGetAsInstanceWithRandom() throws Exception {
    Instances instances = new Instances(new BufferedReader(new StringReader(
        "Name,Age,Nom,Color\n" + "John, 38, 1, red;blue;yellow\n" + "Jack, 15, 2, red;blue;yellow\n")));
    int numAttribs = 4;
}