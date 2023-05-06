import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import java.lang.reflect.Field;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SplittableRandom;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_50 { 
  @Test
         public void testUnmodifiableArrayList() {
        Object[] a = new Object[0];
        List l = java.util.Collections.unmodifiableList(
                        java.util.Arrays.asList(a));
        try {
            l.remove(0);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException success) {}
    }
        
Input: public abstract int numElements();
Output: public void testLengthConstructor() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    assertEquals("Length differs", len, v.numElements());
  }
}