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


public class CodexTest_0_4_10 { 
  @Test
    public void testRemove() {
        String[] a = new String[] { "A", "B", "C", "D", "E" };
        List<String> list = new ArrayList<>(Arrays.asList(a));
        assertEquals("B", list.remove(1));
        assertEquals("A", list.get(0));
        assertEquals("C", list.get(1));
        assertEquals("D", list.get(2));
        assertEquals("E", list.get(3));
        assertEquals(4, list.size());
        assertEquals("A", list.remove(0));
        assertEquals("C", list.get(0));
        assertEquals("D", list.get(1));
        assertEquals("E", list.get(2));
        assertEquals(3, list.size());
        assertEquals("E", list.remove(2));
        assertEquals("C", list.get(0));
        assertEquals("D", list.get(1));
        assertEquals(2, list.size());
        assertEquals("C", list.remove(0));
        assertEquals("D", list.get(0));
        assertEquals(1, list.size());
        assertEquals("D", list.remove(0));
        assertEquals(0, list.size());
    }
}