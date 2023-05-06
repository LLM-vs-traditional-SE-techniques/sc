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


public class CodexTest_0_4_51 { 
  @Test
    public void testRemoveAt() {
        final int SIZE = 10;
        final int REMOVE_INDEX = 5;
        final Object[] data = new Object[SIZE];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        final ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(data));
        final Object removed = list.remove(REMOVE_INDEX);
        assertEquals(data[REMOVE_INDEX], removed);
        assertEquals(SIZE - 1, list.size());
        for (int i = 0; i < REMOVE_INDEX; i++) {
            assertEquals(data[i], list.get(i));
        }
        for (int i = REMOVE_INDEX + 1; i < data.length; i++) {
            assertEquals(data[i], list.get(i - 1));
        }
    }
}