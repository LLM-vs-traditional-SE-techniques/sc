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


public class CodexTest_0_6_10 { 
  @Test
    public void testRemoveWithNull() {
        Object[] a = new Object[2];
        a[1] = null;
        List<Object> list = Arrays.asList(a);
        assertNull(list.remove(1));
        assertEquals(1, list.size());
        assertEquals(Arrays.asList(new Object[] { null }), list);
    }
}