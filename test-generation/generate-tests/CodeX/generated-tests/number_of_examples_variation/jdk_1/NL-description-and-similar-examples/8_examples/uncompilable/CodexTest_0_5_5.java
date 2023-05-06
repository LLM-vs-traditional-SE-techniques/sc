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


public class CodexTest_0_5_5 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            a[i] = i;
        }
        ArrayList<Object> list = new ArrayList<>(a);
        list.remove(0);
        assertEquals(CAPACITY - 1, list.size());
        for (int i = 0; i < CAPACITY - 1; i++) {
            assertEquals(i + 1, list.get(i));
        }
    }
}