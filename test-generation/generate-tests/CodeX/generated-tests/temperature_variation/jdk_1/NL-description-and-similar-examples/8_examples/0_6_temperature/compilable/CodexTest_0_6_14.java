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


public class CodexTest_0_6_14 { 
  @Test
    public void testRemove() {
        final int SIZE = 5;
        final Object[] es = new Object[SIZE];
        for (int i = 0; i < SIZE; i++) {
            es[i] = i;
        }
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        assertEquals(5, al.size());
        assertEquals(new Integer(3), al.remove(3));
        assertEquals(4, al.size());
        assertEquals(new Integer(0), al.get(0));
        assertEquals(new Integer(1), al.get(1));
        assertEquals(new Integer(2), al.get(2));
        assertEquals(new Integer(4), al.get(3));
        assertEquals(new Integer(0), al.remove(0));
        assertEquals(3, al.size());
        assertEquals(new Integer(1), al.get(0));
        assertEquals(new Integer(2), al.get(1));
        assertEquals(new Integer(4), al.get(2));
        assertEquals(new Integer(4), al.remove(2));
        assertEquals(2, al.size());
        assertEquals(new Integer(1), al.get(0));
        assertEquals(new Integer(2), al.get(1));
        assertEquals(new Integer(1), al.remove(0));
        assertEquals(1, al.size());
        assertEquals(new Integer(2), al.get(0));
        assertEquals(new Integer(2), al.remove(0));
        assertEquals(0, al.size());
    }
}