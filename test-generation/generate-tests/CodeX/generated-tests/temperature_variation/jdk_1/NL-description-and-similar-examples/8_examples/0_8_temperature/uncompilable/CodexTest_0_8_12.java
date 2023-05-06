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


public class CodexTest_0_8_12 { 
  @Test
    public void testRemoveRange() {
        Object[] a = new Object[SIZE];
        for (int i = 0; i < SIZE; i++) {
            a[i] = new Object();
        }
        ArrayList<Object> lst = new ArrayList<Object>(Arrays.asList(a));
        Object[] b = new Object[a.length];
        lst.subList(SIZE - 1, SIZE).toArray(b);
        lst.subList(SIZE - 1, SIZE).clear();
        for (int i = 0; i < SIZE - 1; i++) {
            assertSame(a[i], lst.get(i));
        }
    }
}