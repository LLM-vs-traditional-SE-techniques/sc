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


public class CodexTest_0_7_79 { 
  @Test
    public void testContains() {
        Object[] a = new Object[1000];
        for (int i = 0; i < a.length; i++)
            a[i] = new Integer(i);
        List list = Arrays.asList(a);
        for (int i = 0; i < a.length; i++)
            assertTrue(list.contains(a[i]));
        assertFalse(list.contains(new Integer(-1)));
        assertFalse(list.contains(new Object()));
    }
}