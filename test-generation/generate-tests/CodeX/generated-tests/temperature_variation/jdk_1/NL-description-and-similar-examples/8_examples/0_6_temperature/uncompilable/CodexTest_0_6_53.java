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


public class CodexTest_0_6_53 { 
  @Test
    public void testIntRemoveByIndex() {
        final int[] array = {1, 2, 3};
        final List<Integer> list = IntArrayList.wrap(array);
        assertEquals(3, list.size());
        assertEquals(1, list.get(0).intValue());
        assertEquals(2, list.get(1).intValue());
        assertEquals(3, list.get(2).intValue());
        assertEquals(Integer.valueOf(2), list.remove(1));
        assertEquals(2, list.size());
        assertEquals(1, list.get(0).intValue());
        assertEquals(3, list.get(1).intValue());
        assertEquals(Integer.valueOf(3), list.remove(1));
        assertEquals(1, list.size());
        assertEquals(1, list.get(0).intValue());
        assertEquals(Integer.valueOf(1), list.remove(0));
        assertEquals(0, list.size());
    }
}