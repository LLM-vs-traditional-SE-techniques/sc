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


public class CodexTest_0_7_5 { 
  @Test
    
Input: public static <T> T[] copyOf(T[] original, int newLength) {
        @SuppressWarnings("unchecked")
        T[] copy = (newLength > original.length)
            ? (T[]) new Object[newLength]
            : (T[]) new Object[original.length];
        System.arraycopy(original, 0, copy, 0,
                         Math.min(original.length, newLength));
        return copy;
    }
Output:
    
Input: public static <T> T[] copyOfRange(T[] original, int from, int to) {
        int newLength = to - from;
        if (newLength < 0)
            throw new IllegalArgumentException(from + " > " + to);
        @SuppressWarnings("unchecked")
        T[] copy = (T[]) new Object[newLength];
        System.arraycopy(original, from, copy, 0,
                         Math.min(original.length - from, newLength));
        return copy;
    }
Output:
    
Input: public static <T> List<T> nCopies(int n, T o) {
        if (n < 0)
            throw new IllegalArgumentException("List length = " + n);
        return new CopiesList<>(n, o);
    }
Output: public void testNCopies() {
			List<String> list = Collections.nCopies(10, "foo");
			assertEquals(10, list.size());
			assertEquals("foo", list.get(0));
			assertEquals("foo", list.get(1));
			assertEquals("foo", list.get(2));
			assertEquals("foo", list.get(3));
			assertEquals("foo", list.get(4));
			assertEquals("foo", list.get(5));
			assertEquals("foo", list.get(6));
			assertEquals("foo", list.get(7));
			assertEquals("foo", list.get(
}