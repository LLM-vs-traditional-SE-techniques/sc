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


public class CodexTest_0_4_53 { 
  @Test
    public void testRemove() {
        final int[] a = new int[SIZE];
        for (int i = 0; i < SIZE; ++i) {
            a[i] = i;
        }
        final IntArrayList l = new IntArrayList(a);
        assertEquals(SIZE, l.size());
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i, l.get(i));
        }
        for (int i = 0; i < SIZE; ++i) {
            assertEquals(i, l.removeElementAt(0));
            assertEquals(SIZE - (i + 1), l.size());
        }
    }
}