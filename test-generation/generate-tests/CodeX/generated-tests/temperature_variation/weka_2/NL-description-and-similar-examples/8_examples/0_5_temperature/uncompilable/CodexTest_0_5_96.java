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


public class CodexTest_0_5_96 { 
  @Test
    public void testGetAsInstance() {
        Instances model = new Instances(new BufferedReader(new StringReader(
                "a,b,c,d\n" + 
                "0,0,0,0\n" + 
                "1,0,0,0\n" + 
                "0,1,0,0\n" + 
                "0,0,1,0\n" + 
                "0,0,0,1\n" + 
                "0,0,0,2\n" + 
                "0,0,0,3\n" + 
                "0,0,0,4\n" + 
                "0,0,0,5\n" + 
                "0,0,0,6\n" + 
                "0,0,0,7\n" + 
                "0,0,0,8\n" + 
                "0,0,0,9\n" + 
                "0,0,0,10\n" + 
                "0,0,0,11\n" + 
                "0,0,0,12\n" + 
                "0,0,0,13\n" + 
                "0,0,0,14\n" + 
                "0,0,0,15\n" + 
                "0,0,0,16\n" + 
                "0,0,0,17\n" + 
                "0,0,0,18\n" + 
                "0,0,0,19\n" + 
                "0,0,0,20\n" + 
                "0,0,0,21\n" + 
                "0,0,0,22\n" + 
                "0,0,0,23\n" + 
                "0,0,0,24\n" + 
                "0,0,0,25\n")));
        AlgVector v = new AlgVector(new double[] {1, 2, 3, 4
}