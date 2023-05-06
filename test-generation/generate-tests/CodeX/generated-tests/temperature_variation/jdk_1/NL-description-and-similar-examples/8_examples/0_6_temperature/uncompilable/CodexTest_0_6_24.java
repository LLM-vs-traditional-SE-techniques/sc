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


public class CodexTest_0_6_24 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < 100; i++) {
            final int size = random.nextInt(100);
            final Object[] data = new Object[size];
            for (int j = 0; j < size; j++) {
                data[j] = new Object();
            }
            final ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(data));
            final int idx = random.nextInt(size);
            final Object removed = list.remove(idx);
            assertEquals("Wrong element removed", data[idx], removed);
            assertEquals("Wrong list size", size - 1, list.size());
            for (int j = 0; j < size; j++) {
                if (j < idx) {
                    assertSame("Wrong element at position " + j, data[j], list.get(j));
                } else if (j > idx) {
                    assertSame("Wrong element at position " + j, data[j], list.get(j - 1));
                }
            }
        }
    }
}