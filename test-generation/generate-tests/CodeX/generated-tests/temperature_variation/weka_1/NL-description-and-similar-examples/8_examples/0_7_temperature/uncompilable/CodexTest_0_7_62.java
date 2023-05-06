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


public class CodexTest_0_7_62 { 
   @Test
   public void add_throwsException_whenCalledWithNull() {
      AlgVector v1 = new AlgVector(1, 2, 3);
      assertThrows(NullPointerException.class, () -> {
         v1.add(null);
      });
   }
}