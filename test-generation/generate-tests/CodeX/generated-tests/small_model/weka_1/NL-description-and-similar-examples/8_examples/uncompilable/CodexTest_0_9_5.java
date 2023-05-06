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


public class CodexTest_0_9_5 { 
  @Test
  public void testSetValue() {
    AlgVector v = new AlgVector(10);
    int x = 2;
    v.setValue(x, x);
    assertEquals(v.getElement(x), x);
  }
`
	res := ExtractTestDeclareStmt(str)
	if res[0].Start == "" || res[0].End == "" {
		t.Error("This line does not set.")
	}
	if res[0].Method != "testShouldFailDetectingChangesInTestData" {
		t.Error("This line does not detect.")
	}
}
}