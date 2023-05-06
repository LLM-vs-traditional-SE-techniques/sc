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


public class CodexTest_0_3_82 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
								       "Relation test\n" +
								       "Numeric\n" +
								       "Numeric\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "Nominal {a,b,c}\n" +
								       "N
}