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


public class CodexTest_0_6_37 { 
  @Test
  public void testRemoveByIndex() throws Exception {
        final List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        final int val = list.remove(1);
        assertEquals(2, val);
        assertEquals(2, list.size());
        assertEquals(1, (int) list.get(0));
        assertEquals(3, (int) list.get(1));
    }
}