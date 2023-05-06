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


public class CodexTest_0_9_19 { 
         @Test
	public void getInstanceTest(){
                AlgVector v = new AlgVector(new double[]{2.0, 3.0});
                WekaClassifier classifier = new WekaClassifier(v);
                Instances model = classifier.createModel(new Attribute("att", new HashSet<>()));
                
                Random random;
                Instance instance;
                
                for(int i = 0; i < 100; i++){
}