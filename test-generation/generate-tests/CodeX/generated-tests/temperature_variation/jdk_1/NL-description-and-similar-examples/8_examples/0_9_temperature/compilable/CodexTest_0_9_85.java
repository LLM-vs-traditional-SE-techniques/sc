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


public class CodexTest_0_9_85 { 
  @Test
    public void testRemove() {
        final Object[] expected = { "one", "two", "three" };
        ArrayList<Object> list = new ArrayList<>();
        list.add(expected[0]);
        list.add(expected[1]);
        list.add(expected[2]);
        assertEquals(expected[2], list.remove(2));
        assertEquals(expected[1], list.remove(1));
        assertEquals(expected[0], list.remove(0));
        assertEquals(0, list.size());
    }
}