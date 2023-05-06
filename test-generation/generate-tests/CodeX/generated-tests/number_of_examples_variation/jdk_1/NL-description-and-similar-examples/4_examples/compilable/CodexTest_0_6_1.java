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


public class CodexTest_0_6_1 { 
  @Test
    public void testRemove() {
        final List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        List<Integer> subList = list.subList(0, 10);
        assertEquals(subList.size(), 10);
        Iterator<Integer> it = subList.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        assertEquals(subList.size(), 0);
        assertEquals(list.size(), 90);
    }
}