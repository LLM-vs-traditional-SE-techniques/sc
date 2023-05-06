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


public class CodexTest_0_8_8 { 
  @Test
  public void testGetAsInstance() {
    checkGetAsInstance(new String[]{"-R", "1-2", "test/test1.arff"});
    checkGetAsInstance(new String[]{"-R", "5-5", "test/test1.arff"});
    checkGetAsInstance(new String[]{"-R", "5-5", "-V", "test/test1.arff"});
  }
}