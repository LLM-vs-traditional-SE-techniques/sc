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


public class CodexTest_0_8_4 { 
  @Test
  public void testRemove() {
        int size = 100;
        List<Integer> list = new ArrayList<>();
        Arrays.asList(1, 2, 3, 4).forEach(i -> list.add(i));
        Integer val = 5;
        assertEquals(list.size(), size);
        assertEquals(list.remove(list.size() - 1), val);
        assertEquals(list.size() + 1, size);
    }
}