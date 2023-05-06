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


public class CodexTest_0_7_66 { 
  @Test
    public void testRemove() {
        LList<String> list = new LList<String>();
        String[] data = new String[] {"foo", "bar", "baz"};
        Collections.addAll(list, data);
        assertEquals("bar", list.remove(1));
        assertEquals("baz", list.remove(1));
        assertEquals("foo", list.remove(0));
        assertEquals(0, list.size());
    }
}