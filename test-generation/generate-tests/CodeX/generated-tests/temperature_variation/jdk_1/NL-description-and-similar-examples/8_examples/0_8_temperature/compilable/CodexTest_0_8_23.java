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


public class CodexTest_0_8_23 { 
  @Test
    public void testRemove() {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("one");
        deque.add("two");
        assertSame("two", deque.remove(1));
        assertEquals("one", deque.remove());
        assertTrue(deque.isEmpty());
    }
}