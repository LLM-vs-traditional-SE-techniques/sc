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


public class CodexTest_0_8_7 { 
  @Test
    public void testRemove() {
        List<Point> list = new ArrayList<Point>();
        list.add(new Point(1, 2));
        list.add(new Point(3, 4));
        list.add(new Point(5, 6));
        list.add(new Point(7, 8));
        list.add(new Point(9, 10));
        list.add(new Point(11, 12));
        assertEquals(list.remove(0), new Point(1, 2));
        assertEquals(list.remove(1), new Point(5, 6));
        assertEquals(list.remove(0), new Point(3, 4));
        assertEquals(list.remove(1), new Point(9, 10));
        assertEquals(list.remove(0), new Point(7, 8));
        assertEquals(list.remove(0), new Point(11, 12));
        assertEquals(list.size(), 0);
        try {
            list.remove(-1);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
        try {
            list.remove(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}