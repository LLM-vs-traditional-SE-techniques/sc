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


public class CodexTest_0_8_8 { 
        //a test to get the instance from vector
     @Test
     public void testGetInstanceFromVector() throws Exception{
         //given a vector
         double[] vector={1.0,2.0,3.0,4.0};
         //given a model
         Instances model=new Instances(new ArrayList<Attribute>(),0);
         //given a random
         Random random=new Random();
}