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


public class CodexTest_0_3_3 { 
  @Test
    public void testRemove() {
        final int size = 10;
        final List<Object> list = new ArrayList<Object>(size);
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        list.remove(0);
        assertEquals(size - 1, list.size());
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
        assertEquals(5, list.get(4));
        assertEquals(6, list.get(5));
        assertEquals(7, list.get(6));
        assertEquals(8, list.get(7));
        assertEquals(9, list.get(8));
    }
}