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


public class CodexTest_0_8_46 { 
  @Test
    public void testRemoveIndex() {
        ArrayList<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        assertEquals("A", l.remove(0));
        assertEquals("C", l.remove(1));
        assertEquals("E", l.remove(2));
        assertEquals("B", l.remove(0));
        assertEquals("D", l.remove(0));
        assertEquals(0, l.size());
        try {
            l.remove(0);
            fail("Should throw UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
        }
    }
}