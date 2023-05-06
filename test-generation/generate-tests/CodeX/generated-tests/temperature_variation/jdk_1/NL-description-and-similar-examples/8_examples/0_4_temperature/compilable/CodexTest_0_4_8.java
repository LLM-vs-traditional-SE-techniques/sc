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


public class CodexTest_0_4_8 { 
  @Test
    public void testRemove() {
        final int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Integer[] a2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final List<Integer> list = new ArrayList<>(Arrays.asList(a2));
        assertEquals(Arrays.toString(a), 10, list.size());
        for (int i = 0; i < a.length; i++) {
            assertEquals(a[i], list.get(i).intValue());
        }
        for (int i = 0; i < a.length; i++) {
            assertEquals(a[i], list.remove(0).intValue());
        }
        assertEquals(Arrays.toString(a), 0, list.size());
    }
}