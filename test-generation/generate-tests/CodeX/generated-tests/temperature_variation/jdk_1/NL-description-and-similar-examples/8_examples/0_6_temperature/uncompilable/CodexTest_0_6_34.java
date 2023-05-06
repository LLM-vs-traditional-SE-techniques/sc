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


public class CodexTest_0_6_34 { 
  @Test
    public void testRemoveObject() {
        Object[] a = new Object[DEFAULT_SIZE];
        for (int i = 0; i < DEFAULT_SIZE; i++) {
            a[i] = new Integer(i);
        }
        ArrayList al = new ArrayList(Arrays.asList(a));
        al.remove(new Integer(2));
        al.remove(new Integer(1));
        assertEquals(DEFAULT_SIZE-2, al.size());
        assertTrue(al.contains(new Integer(0)));
        assertTrue(al.contains(new Integer(3)));
        assertTrue(al.contains(new Integer(4)));
        assertEquals(new Integer(0), al.get(0));
        assertEquals(new Integer(3), al.get(1));
        assertEquals(new Integer(4), al.get(2));
        assertEquals(new Integer(5), al.get(3));
        assertEquals(new Integer(6), al.get(4));
        assertEquals(new Integer(7), al.get(5));
        assertEquals(new Integer(8), al.get(6));
        assertEquals(new Integer(9), al.get(7));
        assertEquals(new Integer(10), al.get(8));
        assertEquals(new Integer(11), al.get(9));
        assertEquals(new Integer(12), al.get(10));
        assertEquals(new Integer(13), al.get(11));
        assertEquals(new Integer(14), al.get(12));
        assertEquals(new Integer(15), al.get(13));
        assertEquals(new Integer(16), al.get(14));
        assertEquals(new Integer(17), al.get(15));
        assertEquals(new Integer(18), al.get(16));
        assertEquals(new Integer(19), al.get(17));
        assertEquals(new Integer(20), al.get(18));
        assertEquals(new Integer(21), al.get(19
}