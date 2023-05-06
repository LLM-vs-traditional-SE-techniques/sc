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


public class CodexTest_0_9_42 { 
  @Test
    public void testNulls() {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add(null);
        List<String> sub = list.subList(1, 2);
        assertEquals(1, sub.size());
        assertNull(sub.get(0));
        assertNull(sub.remove(0));
        assertEquals(0, sub.size());
        assertEquals(2, list.size());
    }
}