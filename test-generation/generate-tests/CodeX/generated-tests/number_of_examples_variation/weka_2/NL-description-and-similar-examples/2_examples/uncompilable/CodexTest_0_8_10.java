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


public class CodexTest_0_8_10 { 
  @Test
    public void testInstanceConstructor() throws Exception {
    	String file = "/home/xiaoi/runtime/weka-3-7-12/data/iris.arff";
    	FileReader freader = new FileReader(file);
    	Instances data = new Instances(freader); 
    	if (m_Elements != null) {
    		Instance newInst = new DenseInstance(data.numAttributes());
    		newInst.setDataset(data);
    		for (int i = 0, j = 0; i < data.numAttributes(); i++) {
    			if (data.attribute(i).isNumeric()) {
    				if (j >= m_Elements.length)
    					throw new Exception("Datatypes are not compatible.");
    				newInst.setValue(i, m_Elements[j++]);
    			}
    			if (data.attribute(i).isNominal()) {
    				int newVal = (int)
					  (random.nextDouble() * (double) (data.attribute(i).numValues()));
    				if (newVal == (int) data.attribute
}