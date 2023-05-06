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


public class CodexTest_0_5_7 { 
  @Test
    public void testRemove() {
        Object[] a = { "a", "b", "c", "d", "e" };
        List<Object> l = new ArrayList<>(Arrays.asList(a));
        Object[] e = { "a", "b", "c" };
        assertEquals(a[3], l.remove(3));
        assertEquals(Arrays.asList(e), l);
    }
}