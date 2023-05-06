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


public class CodexTest_0_6_56 { 
  @Test
        public void testRemove() {
        final int size = 3;
        final List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        assertEquals(size, list.size());
        for (int i = 0; i < size; i++) {
            Object element = list.remove(i);
            assertEquals(size - i - 1, list.size());
            assertEquals(i, element);
        }
    }
}