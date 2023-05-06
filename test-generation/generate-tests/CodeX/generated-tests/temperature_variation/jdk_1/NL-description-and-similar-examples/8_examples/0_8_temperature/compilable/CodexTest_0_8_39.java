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


public class CodexTest_0_8_39 { 
  @Test
    public void testRemove() {
        Vector<String> list = new Vector<String>();
        list.add("1");
        assertEquals("1", list.get(0));
        assertEquals(1, list.size());
        assertEquals("1", list.remove(0));
        assertEquals(0, list.size());
        try {
            list.remove(0);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        list.add("2");
        assertEquals("2", list.get(0));
        assertEquals(1, list.size());
        assertEquals("2", list.remove(0));
        assertEquals(0, list.size());
    }
}