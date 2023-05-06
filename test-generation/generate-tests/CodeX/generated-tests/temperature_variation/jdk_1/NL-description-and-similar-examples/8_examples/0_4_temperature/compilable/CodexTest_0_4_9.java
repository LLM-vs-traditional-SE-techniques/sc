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


public class CodexTest_0_4_9 { 
  @Test
    public void testRemove() {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        ArrayList<Object> list = new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(o3);
        list.add(o4);
        assertTrue(list.remove(o2));
        assertEquals(3, list.size());
        assertEquals(o1, list.get(0));
        assertEquals(o3, list.get(1));
        assertEquals(o4, list.get(2));
        assertFalse(list.remove(o2));
        assertEquals(3, list.size());
        assertEquals(o1, list.get(0));
        assertEquals(o3, list.get(1));
        assertEquals(o4, list.get(2));
        assertTrue(list.remove(o1));
        assertEquals(2, list.size());
        assertEquals(o3, list.get(0));
        assertEquals(o4, list.get(1));
        assertFalse(list.remove(o1));
        assertEquals(2, list.size());
        assertEquals(o3, list.get(0));
        assertEquals(o4, list.get(1));
        assertTrue(list.remove(o4));
        assertEquals(1, list.size());
        assertEquals(o3, list.get(0));
        assertFalse(list.remove(o4));
        assertEquals(1, list.size());
        assertEquals(o3, list.get(0));
        assertTrue(list.remove(o3));
        assertEquals(0, list.size());
        assertFalse(list.remove(o3));
        assertEquals(0, list.size());
    }
}