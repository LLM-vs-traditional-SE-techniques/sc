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


public class CodexTest_0_4_7 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[SIZE];
        for (int i = 0; i < SIZE; ++i)
            a[i] = new Integer(i);
        Object[] b = new Object[SIZE];
        System.arraycopy(a, 0, b, 0, SIZE);
        List list = new ArrayList(Arrays.asList(a));
        assertTrue(list.remove(new Integer(SIZE/2)));
        assertTrue(Arrays.equals(a, b));
        for (int i = 0; i < SIZE; ++i)
            assertEquals(b[i], list.get(i));
        assertEquals(SIZE - 1, list.size());
    }
}