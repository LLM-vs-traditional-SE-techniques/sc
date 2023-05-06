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


public class CodexTest_0_4_51 { 
  @Test
    public void testContains() {
        List<String> list = new ArrayList<String>();
        assertFalse(list.contains("foo"));
        list.add("foo");
        assertTrue(list.contains("foo"));
        assertFalse(list.contains("bar"));
        list.add("bar");
        assertTrue(list.contains("bar"));
    }
}