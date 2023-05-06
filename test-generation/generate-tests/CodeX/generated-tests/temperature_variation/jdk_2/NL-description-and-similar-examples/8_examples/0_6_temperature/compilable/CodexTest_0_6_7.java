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


public class CodexTest_0_6_7 { 
  @Test
    public void testContains() {
        int[] a = {1, 3, 5};
        List list = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            list.add(new Integer(a[i]));
        }
        for (int i = 0; i < a.length; i++) {
            assertTrue(list.contains(new Integer(a[i])));
        }
        assertTrue(!list.contains(new Integer(0)));
        assertTrue(!list.contains(new Integer(2)));
        assertTrue(!list.contains(new Integer(4)));
        assertTrue(!list.contains(new Integer(6)));
    }

}