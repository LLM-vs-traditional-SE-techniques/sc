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


public class CodexTest_0_7_48 { 
  @Test
    public void testRemoveByIndex() {
        Object[] a = { "a", "b", "c" };
        List<Object> list = new ArrayList<Object>(a.length);
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        Object o = list.remove(1);
        assertEquals(2, list.size());
        assertEquals("[a, c]", list.toString());
    }
}