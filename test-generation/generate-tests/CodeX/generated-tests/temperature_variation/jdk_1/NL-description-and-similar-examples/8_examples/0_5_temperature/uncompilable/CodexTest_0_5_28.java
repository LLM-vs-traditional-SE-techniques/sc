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


public class CodexTest_0_5_28 { 
  @Test
    public void testRemove() {
        Object[] a = new Object[SIZE];
        for (int i = 0; i < SIZE; ++i)
            a[i] = i;
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < SIZE; ++i)
            list.add(i);
        for (int i = 0; i < SIZE; ++i)
            assertEquals(a[i], list.remove(0));
    }
}