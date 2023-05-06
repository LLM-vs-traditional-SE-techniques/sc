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


public class CodexTest_0_6_17 { 
  @Test
    public void testRemoveWithIndex() {
        Object[] a = new Object[] { "a", "b", "c", "d", "e" };
        List<Object> list = new ArrayList<Object>(a.length);
        for (Object o : a) {
            list.add(o);
        }
        list.remove(2);
        assertEquals(a.length - 1, list.size());
        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
        assertEquals("d", list.get(2));
        assertEquals("e", list.get(3));
    }
}