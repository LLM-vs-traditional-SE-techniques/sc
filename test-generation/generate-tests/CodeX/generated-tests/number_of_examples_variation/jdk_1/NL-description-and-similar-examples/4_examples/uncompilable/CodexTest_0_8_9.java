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


public class CodexTest_0_8_9 { 
  @Test
    public void testRemoveIndex() {
        Object[] data = {A, C, B, A, C, A, B,B,B,B,B,B,B,B,B,B,B,B,B,B,B,B,};
        ArrayList<Object> a = new ArrayList<Object>(data.length);
        for (Object element : data) {
            a.add(element);
        }
        assertEquals(a.size(), data.length);
        a.remove(0);
        assertEquals(a.size(), data.length - 1);
        assertFalse(a.contains(A));
        assertTrue(a.contains(B));
        assertTrue(a.contains(C));
        a.remove(0);
        assertEquals(a.size(), data.length - 2);
        assertFalse(a.contains(A));
        assertTrue(a.contains(B));
        assertTrue(a.contains(C));
        a.remove(a.size() - 1);
        assertEquals(a.size(), data.length - 3);
        assertFalse(a.contains(A));
        assertTrue(a.contains(B));
        assertTrue(a.contains(C));
        a.remove(a.size() - 1);
        assertEquals(a.size(), data.length - 4);
        assertFalse(a.contains(A));
        assertTrue(a.contains(B));
        assertFalse(a.contains(C));
        for (int i = 0; i < data.length - 4; i++) {
            assertTrue(a.contains(data[i]));
        }
    }
}