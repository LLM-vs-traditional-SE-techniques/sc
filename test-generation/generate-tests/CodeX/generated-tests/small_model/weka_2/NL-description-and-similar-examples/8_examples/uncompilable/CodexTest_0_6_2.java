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


public class CodexTest_0_6_2 { 
  @Test
  	public void testGetAsInstanceShouldReturnInstanceWithNumValuesSetToNumAttributes() {
			String stringData = "0.0, 0.0, 0.0";
			Instances model = new Instances(new StringReader(stringData));
			model.setClassIndex(0);
			AlgVector v = new AlgVector(0.0);
			v.setClassIndex(0);
			v.setDatas
}