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


public class CodexTest_0_9_64 { 
  @Test
  public void testValidFilename() throws IOException
  {
     assertEquals(true, new SuperUtils().isValidFileName("Spam Assasin"));
  }
  @Test
  public void testInvalidFilename() throws IOException
  {
     assertEquals(false, new SuperUtils().isValidFileName("Spam Assasin.txt"));
  }
}