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


public class CodexTest_0_5_24 { 
  @Test
    public void testRemoveAtIndex() {
        final Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(values));
        assertEquals(values[1], list.remove(1));
        assertEquals(9, list.size());
        assertEquals(values[2], list.get(1));
        assertEquals(values[0], list.get(0));
        assertEquals(values[3], list.get(2));
    }
    public void testRemoveAtIndex() {
        final Integer[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(values));
        assertEquals(values[1], list.remove(1));
        assertEquals(9, list.size());
        assertEquals(values[2], list.get(1));
        assertEquals(values[0], list.get(0));
        assertEquals(values[3], list.get(2));
    }
}