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


public class CodexTest_0_7_4 { 
  @Test
    public void testRemoveRange() {
        Object[] a = {1, 2, 3, 4, 5};
        ArrayList<Object> l = new ArrayList<Object>();
        for (int i = 0; i < a.length; i++)
            l.add(a[i]);
        l.removeRange(1, 4);
        Object[] r = new Object[a.length - 3];
        for (int i = 0; i < r.length; i++)
            r[i] = l.get(i);
        assertArrayEquals(new Object[]{1, 5}, r);
    }
}