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


public class CodexTest_0_6_43 { 
  @Test
  public void testRemove() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(Integer.valueOf(2));
        assertEquals(Arrays.asList(1, 3), list);
        list.remove(Integer.valueOf(1));
        assertEquals(Arrays.asList(3), list);
        list.remove(Integer.valueOf(3));
        assertEquals(Arrays.asList(), list);
    }
}