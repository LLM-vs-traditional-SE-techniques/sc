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


public class CodexTest_0_9_87 { 
  @Test
  public void testIncremental() {
    try {
    Instances train = new Instances(new BufferedReader(      new FileReader(m_trainFile.toString())));
    train.setClassIndex(train.numAttributes() - 1);
    	Preprocessing preprocessing = new Normalize(); 
    	preprocessing.setInputFormat(train);
    
    Instances instances = Filter.useFilter(train, preprocessing);
}