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


public class CodexTest_0_9_56 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[26];
        for (int i = 0; i < a.length; i++)
            a[i] = Integer.valueOf(i);
        ArrayList<Object> x = new ArrayList<>(Arrays.asList(a));
        assertTrue(x.remove(Integer.valueOf(0)));
        assertTrue(x.remove(Integer.valueOf(10)));
        assertTrue(x.remove(Integer.valueOf(20)));
        assertTrue(x.remove(Integer.valueOf(25)));
        assertEquals(Arrays.toString(new Object[]{1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,21,22,23,24}), x.toString());
    }
}