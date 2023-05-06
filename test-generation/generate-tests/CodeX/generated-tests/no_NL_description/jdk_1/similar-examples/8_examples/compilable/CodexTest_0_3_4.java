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


public class CodexTest_0_3_4 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[] { "A", "B", "C", "D", "E" };
        List<Object> l = new ArrayList<>(Arrays.asList(a));
        assertEquals("C", l.remove(2));
        assertEquals(Arrays.asList("A", "B", "D", "E"), l);
        assertEquals("A", l.remove(0));
        assertEquals(Arrays.asList("B", "D", "E"), l);
        assertEquals("E", l.remove(2));
        assertEquals(Arrays.asList("B", "D"), l);
        assertEquals("B", l.remove(0));
        assertEquals(Arrays.asList("D"), l);
        assertEquals("D", l.remove(0));
        assertEquals(Arrays.asList(), l);
    }
}