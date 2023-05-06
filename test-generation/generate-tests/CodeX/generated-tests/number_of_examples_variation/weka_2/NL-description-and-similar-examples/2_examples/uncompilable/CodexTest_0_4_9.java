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


public class CodexTest_0_4_9 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Instances model = new Instances(new BufferedReader(new StringReader(
									"@relation test\n" +
									"@attribute a numeric\n" +
									"@attribute b numeric\n" +
									"@attribute c numeric\n" +
									"@attribute d {a,b,c}\n" +
									"@attribute e {a,b,c}\n" +
									"@attribute f {a,b,c}\n" +
									"@attribute g {a,b,c}\n" +
									"@attribute h {a,b,c}\n" +
									"@attribute i {a,b,c}\n" +
									"@attribute j {a,b,c}\n" +
									"@data\n" +
									
}