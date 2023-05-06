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


public class CodexTest_0_6_33 { 
  @Test
    public void testRemove() {
        Object[] a = { "A", "B", "C", "D" };
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(a));
        assertTrue(list.remove("A"));
        assertTrue(list.remove("C"));
        assertEquals(2, list.size());
        assertEquals("B", list.get(0));
        assertEquals("D", list.get(1));
    }
}