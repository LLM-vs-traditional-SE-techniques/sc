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


public class CodexTest_0_4_4 { 
  @Test
    public void testRemove() {
        Object[] a = { "A", "B", "C", "D", "E", "F" };
        ArrayList<Object> l = new ArrayList<>();
        for (Object s : a) {
            l.add(s);
        }
        Object[] r = { "B", "C", "D", "E", "F" };
        assertEquals("A", l.remove(0));
        assertEquals(Arrays.asList(r), l);
        assertEquals("F", l.remove(4));
        assertEquals(Arrays.asList("B", "C", "D", "E"), l);
        assertEquals("B", l.remove(0));
        assertEquals(Arrays.asList("C", "D", "E"), l);
        assertEquals("E", l.remove(2));
        assertEquals(Arrays.asList("C", "D"), l);
        assertEquals("C", l.remove(0));
        assertEquals(Arrays.asList("D"), l);
        assertEquals("D", l.remove(0));
        assertEquals(Arrays.asList(), l);
    }
}