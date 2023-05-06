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


public class CodexTest_0_5_88 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < list.size(); i++) {
            assertEquals(i, list.get(i).intValue());
        }
        assertEquals(new Integer(0), list.remove(0));
        assertEquals(new Integer(1), list.remove(0));
        assertEquals(new Integer(2), list.remove(0));
        assertEquals(new Integer(3), list.remove(0));
        assertEquals(new Integer(4), list.remove(0));
        assertEquals(new Integer(5), list.remove(0));
        assertEquals(new Integer(6), list.remove(0));
        assertEquals(new Integer(7), list.remove(0));
        assertEquals(new Integer(8), list.remove(0));
        assertEquals(new Integer(9), list.remove(0));
        try {
            list.remove(0);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}