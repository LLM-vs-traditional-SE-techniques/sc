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


public class CodexTest_0_4_41 { 
  @Test
    public void testRemove() {
        Object[] a = { "A", "B", "C", "D", "E" };
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        list.remove(0);
        assertEquals(list.get(0), "B");
        assertEquals(list.get(1), "C");
        assertEquals(list.get(2), "D");
        assertEquals(list.get(3), "E");
    }
}