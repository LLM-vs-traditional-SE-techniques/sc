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


public class CodexTest_0_7_7 { 
  @Test
    public void testNullRemove() {
        List<Object> list = new ArrayList<Object>();
        list.add(null);
        list.remove(null);
        assertEquals(0, list.size());
    }
    public void testRemoveAll() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        assertEquals(8, list.size());
        assertTrue(list.removeAll(Arrays.asList("a", "b", "c", "d")));
        assertEquals(4, list.size());
        assertEquals(Arrays.asList("e", "f", "g", "h"), list);
        assertTrue(list.removeAll(Arrays.asList("e", "f", "g", "h")));
        assertEquals(0, list.size());
        assertEquals(Arrays.asList(), list);
        assertFalse(list.removeAll(Arrays.asList("e", "f", "g", "h")));
        assertEquals(0, list.size());
        assertEquals(Arrays.asList(), list);
    }
    public void testHashCode() {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        assertEquals(8, list.size());
        assertTrue(list.removeAll(Arrays.asList("a", "b", "c", "d")));
        assertEquals(4, list.size());
        assertEquals(Arrays.asList("e", "f", "g", "h"), list);
        assertTrue(
}