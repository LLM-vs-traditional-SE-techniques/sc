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


public class CodexTest_0_7_41 { 
  @Test
    public void testRemove() {
        Integer[] a = {2, 4, 6, 8, 10, 12};
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
        list.remove(5);
        assertFalse(list.contains(12));
        assertEquals(5, list.size());
        assertEquals(2, (int)list.get(0));
        assertEquals(10, (int)list.get(3));
    }
}