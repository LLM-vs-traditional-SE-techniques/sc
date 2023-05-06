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


public class CodexTest_0_5_96 { 
  @Test
    public void testRemove_int() {
        Object[] a = new Object[SIZE];
        Arrays.fill(a, new Object());
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(a));
        for (int i = 0; i < list.size(); i++) {
            assertSame(a[i], list.remove(i));
            assertEquals(list.size(), SIZE - i - 1);
        }
        assertTrue(list.isEmpty());
    }
}