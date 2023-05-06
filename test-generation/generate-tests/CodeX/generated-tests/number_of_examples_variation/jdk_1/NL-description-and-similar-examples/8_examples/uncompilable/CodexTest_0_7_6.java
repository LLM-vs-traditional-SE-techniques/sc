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


public class CodexTest_0_7_6 { 
  @Test
    public void testRemove() {
        Vector<String> v = new Vector<String>(10);
        for (int i = 0; i < v.capacity(); i++) {
            assertTrue(v.add(String.valueOf(i)));
        }
        assertEquals(10, v.capacity());
        assertEquals(10, v.size());
        for (int i = 0; i < v.size(); i++) {
            assertEquals(String.valueOf(i), v.get(i));
        }
        assertEquals(String.valueOf(9), v.remove(9));
        assertEquals(9, v.size());
        for (int i = 0; i < v.size(); i++) {
            assertEquals(String.valueOf(i), v.get(i));
        }
        assertEquals(String.valueOf(0), v.remove(0));
        assertEquals(8, v.size());
        for (int i = 0; i < v.size(); i++) {
            assertEquals(String.valueOf(i + 1), v.get(i));
        }
        assertEquals(String.valueOf(4), v.remove(3));
        assertEquals(7, v.size());
        assertEquals(String.valueOf(5), v.get(3));
        assertEquals(String.valueOf(3), v.remove(2));
        assertEquals(6, v.size());
        assertEquals(String.valueOf(4), v.get(2));
        assertEquals(String.valueOf(5), v.get(3));
        assertEquals(String.valueOf(6), v.remove(v.size() - 1));
        assertEquals(5, v.size());
        assertEquals(String.valueOf(1), v.get(0));
        assertEquals(String.valueOf(2), v.get(1));
        assertEquals(String.valueOf(4), v.get(2));
        assertEquals(String.valueOf(5), v.get(3));

}