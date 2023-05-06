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
        Object[] a = new Object[SIZE];
        for (int i = 0; i < SIZE; i++)
            a[i] = new Integer(i);
        List<Object> list = new ArrayList<>(Arrays.asList(a));
        assertTrue(list.remove(new Integer(3)));
        assertEquals(SIZE-1, list.size());
        assertFalse(list.contains(new Integer(3)));
        assertTrue(list.remove(new Integer(2)));
        assertEquals(SIZE-2, list.size());
        assertFalse(list.contains(new Integer(2)));
        assertTrue(list.remove(new Integer(1)));
        assertEquals(SIZE-3, list.size());
        assertFalse(list.contains(new Integer(1)));
        assertTrue(list.remove(new Integer(0)));
        assertEquals(SIZE-4, list.size());
        assertFalse(list.contains(new Integer(0)));
        assertTrue(list.remove(new Integer(SIZE-1)));
        assertEquals(SIZE-5, list.size());
        assertFalse(list.contains(new Integer(SIZE-1)));
        assertTrue(list.remove(new Integer(SIZE-2)));
        assertEquals(SIZE-6, list.size());
        assertFalse(list.contains(new Integer(SIZE-2)));
    }
}