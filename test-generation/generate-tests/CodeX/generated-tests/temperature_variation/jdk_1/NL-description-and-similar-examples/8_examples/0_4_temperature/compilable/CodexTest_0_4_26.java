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


public class CodexTest_0_4_26 { 
  @Test
    public void testRemove() {
        Object[] a = { "A", "B", "C", "D", "E" };
        ArrayList<Object> l = new ArrayList<>(Arrays.asList(a));
        Object o = l.remove(2);
        assertEquals("C", o);
        assertEquals(Arrays.asList("A", "B", "D", "E"), l);
        assertEquals(a.length - 1, l.size());
        a = new Object[] { "A", "B", "D", "E" };
        l = new ArrayList<>(Arrays.asList(a));
        o = l.remove(0);
        assertEquals("A", o);
        assertEquals(Arrays.asList("B", "D", "E"), l);
        assertEquals(a.length - 1, l.size());
        a = new Object[] { "B", "D", "E" };
        l = new ArrayList<>(Arrays.asList(a));
        o = l.remove(a.length - 1);
        assertEquals("E", o);
        assertEquals(Arrays.asList("B", "D"), l);
        assertEquals(a.length - 1, l.size());
    }
}