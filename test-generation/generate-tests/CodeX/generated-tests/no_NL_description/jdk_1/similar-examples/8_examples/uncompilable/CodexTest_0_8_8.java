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


public class CodexTest_0_8_8 { 
  @Test
    public void testRemoveRange() {
        int size = 3;
        final Integer[] data = new Integer[size];
        for (int i = 0; i < size; i++)
            data[i] = Integer.valueOf(i + 1);
        list.addAll(Arrays.asList(data));
        list.removeRange(1, 3);
        assertEquals(size - 2, list.size());
        assertTrue(list.contains(Integer.valueOf(1)));
        assertTrue(list.contains(Integer.valueOf(4)));
    }
}