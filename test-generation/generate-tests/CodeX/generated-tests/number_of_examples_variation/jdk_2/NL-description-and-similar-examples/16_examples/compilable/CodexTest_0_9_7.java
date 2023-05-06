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


public class CodexTest_0_9_7 { 
  @Test
    public void testLambda() throws Exception{
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(5);
        set.add(12);
        set.add(15);
        boolean flag = set.contains(Integer.valueOf(1));
        assertTrue(flag);
        flag = set.contains(Integer.valueOf(5));
        assertTrue(flag);
        flag = set.contains(Integer.valueOf(12));
        assertTrue(flag);
        flag = set.contains(Integer.valueOf(15));
        assertTrue(flag);
        flag = set.contains(Integer.valueOf(16));
        assertFalse(flag);
        flag = set.contains(Integer.valueOf(17));
        assertFalse(flag);
        flag = set.contains(Integer.valueOf(18));
        assertFalse(flag);
        flag = set.contains(Integer.valueOf(19));
        assertFalse(flag);
        flag = set.contains(Integer.valueOf(20));
        assertFalse(flag);
        flag = set.contains("C8W");
        assertFalse(flag);
        flag = set.contains("Z17");
        assertFalse(flag);
    }

}