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


public class CodexTest_0_3_13 { 
  @Test
    public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
									"\n@relation test\n" +
									"\n@attribute a numeric\n" +
									"\n@attribute b numeric\n" +
									"\n@attribute c numeric\n" +
									"\n@attribute d numeric\n" +
									"\n@attribute e numeric\n" +
									"\n@attribute f numeric\n" +
									"\n@attribute g numeric\n" +
									"\n@attribute h numeric\n" +
									"\n@attribute i numeric\n" +
									"\n@data\n" +
									"1,2,3,4,5,6,7,8,9,10\n" +
									"1,2,3,4,5,6,7,8,9,10\n" +
									"1,2,3,4,5,6,7,8,9,10\n" +
									"1,2,3,4,5,6,7,8,9,10\n" +
									"1,2,3,4,5,6,7,8,9,10\n" +
									"1,2,3,4,5,6,7,8,9,10\n" +
									"1,2,3,4,5,6,7,8,9,10\n" +
					
}