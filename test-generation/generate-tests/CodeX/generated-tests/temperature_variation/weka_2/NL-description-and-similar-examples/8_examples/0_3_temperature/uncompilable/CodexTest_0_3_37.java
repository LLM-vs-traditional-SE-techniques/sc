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


public class CodexTest_0_3_37 { 
  @Test
    public void testGetAsInstance() {
			AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
			try {
				Instances model = new Instances(new StringReader(
						"@relation test\n" +
						"@attribute a numeric\n" +
						"@attribute b numeric\n" +
						"@attribute c numeric\n" +
						"@attribute d numeric\n" +
						"@attribute e numeric\n" +
						"@attribute f numeric\n" +
						"@attribute g numeric\n" +
						"@attribute h numeric\n" +
						"@attribute i numeric\n" +
						"@attribute j numeric\n" +
						"@data\n" +
						"1,2,3,4,5,6,7,8,9,10\n" +
						"1,2,3,4,5,6,7,8,9,10\n" +
						"1,2,3,4,5,6,7,8,9,10\n" +
						"1,2,3,4,5,6,7,8,9,10\n" +
						"1,2,3,4,5,6,7,8,9,10\n" +
						"1,2,3,4,5,6,7,8,9,10\n" +
						"1,2,3,4,5,6,7,8,9,10\n" +
						"1,2,3,4,5,6,7,8,9,10\n" +

}