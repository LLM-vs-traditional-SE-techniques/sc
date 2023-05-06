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


public class CodexTest_0_4_71 { 
  @Test
    public void testRemove() {
        final Object[] a = new Object[SIZE];
        for (int i = 0; i < SIZE; ++i) {
            a[i] = i;
        }
        Object[] b = new Object[SIZE];
        System.arraycopy(a, 0, b, 0, SIZE);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(a[i], b[i]);
        }
        Random rnd = new Random(SEED);
        for (int i = SIZE; i > 1; --i) {
            int j = rnd.nextInt(i);
            Object t = b[j];
            b[j] = b[i - 1];
            b[i - 1] = t;
        }
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(a[i], b[i]);
        }
        Arrays.sort(b);
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(a[i], b[i]);
        }
    }
}