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


public class CodexTest_0_9_28 { 
  @Test
    public void testRemoveLast() {
        Object[] data = new Object[] {"foo", "bar", "baz"};
        Set<Object> set = new LinkedHashSet<>(Arrays.asList(data));
        assertSame(data[2], set.remove("baz"));
        assertFalse(set.contains("baz"));
        assertArrayEquals(Arrays.copyOf(data, 2), set.toArray());
    }
}