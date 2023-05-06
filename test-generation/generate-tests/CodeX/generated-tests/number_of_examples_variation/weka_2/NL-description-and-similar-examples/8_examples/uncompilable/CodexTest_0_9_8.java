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


public class CodexTest_0_9_8 { 
  @Test
    /*private void generateRandomLabels(List<Attribute> labattv, Instances model, 
				      int num, Random random){
				      }*/
    public void test_generateRandomLabels() {
				List<Attribute> l_labattv = new ArrayList<Attribute>();
				int num = 0;
				Random random = new Random();
				model = new Instances(new BufferedReader(new FileReader(l_labelFile)));
				labInsts = new Instances(model,0);
				generateRandomLabels(l_labattv, model, num,random); 
				}
}