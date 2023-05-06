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


public class CodexTest_0_6_29 { 
  @Test
    public void testRemoveWithIndex() {
        List<String> list = new ArrayList<String>();
        list.add("foo");
        assertEquals(1, list.size());
        assertEquals("foo", list.remove(0));
        assertEquals(0, list.size());
    }
    public void testRemoveWithIndexOutOfBounds() {
        List<String> list = new ArrayList<String>();
        list.add("foo");
        assertEquals(1, list.size());
        try {
            list.remove(1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }
}