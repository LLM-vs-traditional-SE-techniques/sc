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


public class CodexTest_0_8_5 { 
  @Test
    public void testRemoveAt() {
        int n = 9;
        int removedIndex = n / 2;
        List<Integer> list = new ArrayList<Integer>(n);
        for (int i = 0; i < n; ++i) {
            list.add(i);
        }
        int removed = list.remove(removedIndex);
        assertEquals(n - 1, list.size());
        assertEquals(removedIndex, removed);
        for (int i = 0; i < n; ++i) {
            if (i < removedIndex) {
                assertEquals(new Integer(i), list.get(i));
            } else if (i > removedIndex) {
                assertEquals(new Integer(i), list.get(i - 1));
            }
        }
    }
}