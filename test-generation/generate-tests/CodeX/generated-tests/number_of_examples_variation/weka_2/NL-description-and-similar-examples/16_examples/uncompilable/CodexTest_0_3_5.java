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


public class CodexTest_0_3_5 { 
  @Test
    public void testGetAsInstance() {
			try {
				AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
				Instances model = new Instances(new BufferedReader(new StringReader(
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
						"@attribute k numeric\n" +
						"@attribute l numeric\n" +
						"@attribute m numeric\n" +
						"@attribute n numeric\n" +
						"@attribute o numeric\n" +
						"@attribute p numeric\n" +
						"@attribute q numeric\n" +
						"@attribute r numeric\n" +
						"@attribute s numeric\n" +
						"@attribute t numeric\n" +
						"@attribute u numeric\n" +
						"@attribute v numeric\n" +
						"@attribute w numeric\n" +
						"@attribute x numeric\n" +
						"@attribute y numeric\n" +
						"@attribute z numeric\n" +

}