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


public class CodexTest_0_5_4 { 
  @Test
    public void testRemoveByIndex() {
        Object[] a = new Object[SIZE];
        for (int i = 0; i < SIZE; i++) {
            a[i] = makeElement(i);
        }
        List<Object> list = new ArrayList<Object>(Arrays.asList(a));
        assertTrue(list.remove(SIZE-1).equals(makeElement(SIZE-1)));
        assertTrue(list.size() == SIZE-1);
        assertTrue(list.remove(0).equals(makeElement(0)));
        assertTrue(list.size() == SIZE-2);
        assertTrue(list.remove(SIZE/2).equals(makeElement(SIZE/2)));
        assertTrue(list.size() == SIZE-3);
    }
}