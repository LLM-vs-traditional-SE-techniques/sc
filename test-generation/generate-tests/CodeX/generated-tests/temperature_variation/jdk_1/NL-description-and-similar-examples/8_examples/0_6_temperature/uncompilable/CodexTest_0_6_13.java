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


public class CodexTest_0_6_13 { 
  @Test
    public void testRemove() {
        assertEquals("1st remove failed", "A", a.remove(0));
        assertEquals("2nd remove failed", "B", a.remove(0));
        assertEquals("3rd remove failed", "C", a.remove(0));
        assertEquals("4th remove failed", "D", a.remove(0));
        assertEquals("5th remove failed", "E", a.remove(0));
        try {
            a.remove(0);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected
        }
    }
}