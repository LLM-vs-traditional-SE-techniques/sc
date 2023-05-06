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


public class CodexTest_0_8_9 { 
  @Test
  private final void checkGetAsInstance() {
    Instances instanceInfo = new Instances(new StringReader("@relation AlgVector\n\n" +
							    "@attribute attr numeric\n" +
							    "@attribute attr0 numeric\n" +
							    "@attribute attr1 numeric\n" +
							    "@attribute attr2 numeric\n" +
							    "@attribute attr3 numeric\n\n" +
							    "@data\n" +
							    "0, 1, 2, 3, 4\n"));
    AlgVector v4 = AlgVector.parse("0, 1, 2, 3, 4");
}