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


public class CodexTest_0_7_10 { 
  @Test
    public void testRemoveFromSubList() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> subList = list.subList(3, 7);
        subList.remove(3);
        assertEquals(3, subList.size());
        assertEquals(Arrays.asList(3, 4, 5), subList);
        assertEquals(Arrays.asList(0, 1, 2, 6, 7, 8, 9), list);
    }
}