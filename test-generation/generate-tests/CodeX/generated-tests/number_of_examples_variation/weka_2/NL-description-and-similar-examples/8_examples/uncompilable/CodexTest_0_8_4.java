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


public class CodexTest_0_8_4 { 
  @Test
    public void testWriteRead() {
	Instances data1 = makeTestDataset(42, 5, 7, 3);
	Instances data2 = makeTestDataset(24, 5, 7, 3);
	AlgVector test = new AlgVector(data1.numAttributes());
	for (int i = 0; i < data1.numAttributes(); i++) {
	  test.setElement(i, i);
	}
}