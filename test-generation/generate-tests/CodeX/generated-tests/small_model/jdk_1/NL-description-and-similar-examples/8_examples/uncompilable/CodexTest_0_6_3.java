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


public class CodexTest_0_6_3 { 
  @Test
    public void testRemoveObject() {
        final Object[] es = elementData;
        final Object oldValue = es[3];
        es[3] = null;
        @SuppressWarnings("unchecked") final ArrayList<Object> list = (ArrayList<Object>) clone();
        list.remove(3);
        assertEquals(es.length - 1, list.size());
        assertTrue(Arrays.equals(es, list.elementData));
        for (int i = 0; i < 3; i++) {
            assertEquals(oldValue, list.get(i));
        }
        assertEquals(es[4], list.get(3));
    }
}