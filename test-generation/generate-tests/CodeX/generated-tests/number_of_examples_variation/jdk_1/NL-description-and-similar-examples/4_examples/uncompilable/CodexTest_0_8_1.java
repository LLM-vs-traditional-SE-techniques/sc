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


public class CodexTest_0_8_1 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[SIZE];
        for (int i = 0; i < SIZE; i++)
            a[i] = new Integer(i);
        List<Object> x = new ArrayList<>(Arrays.asList(a));
        assertEquals(Arrays.asList(a), x);
        assertTrue(x.remove(two));
        assertTrue(x.remove(null));
        a = new Integer[]{zero, one, three, four, five, six, seven, eight, nine};
        assertEquals(Arrays.asList(a), x);
        assertTrue(x.remove(one));
        assertTrue(x.remove(five));
        assertTrue(x.remove(seven));
        assertTrue(x.remove(eight));
        a = new Integer[]{zero, three, four, six, nine};
        assertEquals(Arrays.asList(a), x);
        x.add(null);
        assertNull(x.remove(10));
    }
}