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


public class CodexTest_0_6_64 { 
  @Test
    public void testRemoveAt() {
        final Object[] data = new Object[] { "a", "b", "c" };
        final FastArrayList<Object> list = new FastArrayList<>(data);
        assertSame("a", list.remove(0));
        assertEquals(Arrays.asList("b", "c"), list);
    }
}