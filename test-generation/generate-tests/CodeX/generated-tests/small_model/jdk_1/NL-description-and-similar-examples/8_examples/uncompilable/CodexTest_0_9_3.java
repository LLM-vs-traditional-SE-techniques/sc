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


public class CodexTest_0_9_3 { 
  @Test
   public void testRemove() {
        FastVector array =
                new FastVector(new Comparable[] { new Integer(7), new Double(1.0), new Float(12.0) })
                .sort(false);
        array.remove(2);
        assertTrue(array.contains((Integer)7));
        assertFalse(array.contains((Double)1.0));
        assertTrue(array.contains((Float)12.0));
        array.remove(2);
        assertTrue(array.get(0).equals(13));
    }

}