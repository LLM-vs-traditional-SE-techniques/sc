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


public class CodexTest_0_5_10 { 
  @Test
    public void testRemoveIndex() {
        assertEquals("1", a.remove(0));
        assertEquals("two", a.remove(0));
        assertEquals("3", a.remove(0));
        assertEquals("four", a.remove(0));
        assertEquals("five", a.remove(0));
        assertEquals("six", a.remove(0));
        try {
            a.remove(0);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
        }
    }
}