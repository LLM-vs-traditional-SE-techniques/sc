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


public class CodexTest_0_5_9 { 
  @Test
    public void testRemove() {
        Random random = new Random(0);
        int size = 1000;
        int[] values = new int[size];
        for (int i = 0; i < size; i++) {
            values[i] = random.nextInt();
        }
        IntArrayList list = new IntArrayList(values);
        list.remove(0);
        assertEquals(size - 1, list.size());
        assertEquals(values[1], list.get(0));
        list.remove(list.size() - 1);
        assertEquals(size - 2, list.size());
        assertEquals(values[1], list.get(0));
        assertEquals(values[size - 2], list.get(size - 3));
    }
}