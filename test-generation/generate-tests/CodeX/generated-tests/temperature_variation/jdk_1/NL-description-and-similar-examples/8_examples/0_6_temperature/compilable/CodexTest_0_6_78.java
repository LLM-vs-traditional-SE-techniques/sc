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


public class CodexTest_0_6_78 { 
  @Test
    public void testRemove() {
        Object[] a = {0, 1, 2, 3, 4, 5};
        ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(a));
        for (int i = 0; i < a.length; i++) {
            list.remove(0);
            assertEquals(a.length - i - 1, list.size());
            assertTrue(list.equals(Arrays.asList(Arrays.copyOfRange(a, i + 1, a.length))));
        }
    }
}