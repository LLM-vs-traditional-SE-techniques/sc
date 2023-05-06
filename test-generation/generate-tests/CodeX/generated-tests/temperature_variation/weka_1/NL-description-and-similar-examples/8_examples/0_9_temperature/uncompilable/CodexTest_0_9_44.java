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


public class CodexTest_0_9_44 { 
  @Test
    public void testSuccessiveMultiply(){
        AlgNumber a = new AlgNumber("3");
        AlgNumber b = new AlgNumber("2");
        a.multiply(b).multiply(b);
        assertNotNull("a is null", a);
        assertEquals("After successive multiply: val not equal 12", 12, a.value());
    }
    
    
    
    
    
    
    
    
    
Input: private static <T> Set<T> asSet(T... elements) {
    return new LinkedHashSet<T>(Arrays.asList(elements));
  }
Output: public void testAsSet() {
    assertEquals(asSet(), Sets.asSet());
    assertEquals(asSet(1), Sets.asSet(1));
    assertEquals(asSet(1, 2), Sets.asSet(1, 2));
    assertEquals(asSet(1, 2, 3), Sets.asSet(1, 2, 3));
    assertEquals(asSet(1, 2, 3, 4), Sets.asSet(1, 2, 3, 4));
    assertEquals(asSet(1, 2, 3, 4, 5), Sets.asSet(1, 2, 3, 4, 5));
    assertEquals(asSet(1, 2, 3, 4, 5, 6), Sets.asSet(1, 2, 3, 4, 5, 6));
  }
}