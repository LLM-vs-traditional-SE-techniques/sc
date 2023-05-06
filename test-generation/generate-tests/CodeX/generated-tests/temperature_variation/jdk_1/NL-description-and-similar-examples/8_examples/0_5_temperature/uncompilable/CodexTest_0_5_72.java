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


public class CodexTest_0_5_72 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            a[i] = i;
        }
        Object[] b = new Object[CAPACITY];
        System.arraycopy(a, 0, b, 0, CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            assertEquals(a[i], b[i]);
        }
        List<Object> list = new ArrayList<>(Arrays.asList(a));
        for (int i = 0; i < CAPACITY; i++) {
            assertEquals(a[i], list.get(i));
        }
        for (int i = 0; i < CAPACITY; i++) {
            list.remove(i);
        }
        assertTrue(list.isEmpty());
    }
}