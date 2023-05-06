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


public class CodexTest_0_4_14 { 
  @Test
    public void testRemove() {
        Object[] a = { "A", "B", "C", "D", "E" };
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(a));
        assertEquals("B", list.remove(1));
        assertEquals(Arrays.asList("A", "C", "D", "E"), list);
        assertEquals("C", list.remove(1));
        assertEquals(Arrays.asList("A", "D", "E"), list);
        assertEquals("D", list.remove(1));
        assertEquals(Arrays.asList("A", "E"), list);
        assertEquals("E", list.remove(1));
        assertEquals(Arrays.asList("A"), list);
        assertEquals("A", list.remove(0));
        assertEquals(Arrays.asList(), list);
        assertEquals(0, list.size());
    }
}