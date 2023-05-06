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


public class CodexTest_0_5_2 { 
  @Test
  public void testGetAsInstance() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    Instances model = null;
    try {
      Random random = new Random(0);
      model = new Instances(new BufferedReader(new StringReader(
								"@relation test\n" +
								"@attribute A numeric\n" +
								"@attribute B numeric\n" +
								"@attribute C numeric\n" +
								"@attribute D numeric\n" +
								"@attribute E numeric\n" +
								"@attribute F numeric\n" +
								"@attribute G numeric\n" +
								"@attribute H numeric\n" +
								"@attribute I numeric\n" +
								"@attribute J numeric\n" +
								"@attribute K numeric\n" +
								"@attribute L numeric\n" +
								"@attribute M numeric\n" +
								"@attribute N numeric\n" +
								"@attribute O numeric\n" +
								"@attribute P numeric\n" +
								"@attribute Q numeric\n" +
								"@attribute R numeric\n" +
								"@attribute S numeric\n" +
								"@attribute T numeric\n" +
								"@attribute U numeric\n" +
								"@data\n" +
								"0,0,0,0,0,
}