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


public class CodexTest_0_2_4 { 
  @Test
    public void testRemove() {
        final int size = 3;
        final Object[] es = new Object[size];
        es[0] = "foo";
        es[1] = "bar";
        es[2] = "baz";
        final Object removed = es[1];
        final Object[] expected = new Object[size];
        System.arraycopy(es, 0, expected, 0, size);
        expected[1] = null;
        Arrays.sort(expected);
        final Object[] actual = new Object[size];
        System.arraycopy(es, 0, actual, 0, size);
        actual[1] = null;
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
        final Object removed2 = es[1];
        assertEquals(removed, removed2);
    }
}