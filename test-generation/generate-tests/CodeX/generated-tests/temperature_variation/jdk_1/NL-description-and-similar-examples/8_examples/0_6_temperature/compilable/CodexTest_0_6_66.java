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


public class CodexTest_0_6_66 { 
  @Test
    public void testRemoveIndex() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "d", "b"));
        assertEquals("a", list.remove(0));
        assertEquals("b", list.remove(1));
        assertEquals("a", list.remove(1));
        assertEquals("c", list.remove(1));
        assertEquals("d", list.remove(1));
        assertEquals("b", list.remove(0));
        assertTrue(list.isEmpty());
    }
}