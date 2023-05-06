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


public class CodexTest_0_8_35 { 
  @Test
    public void testBasicRemove() {
        ArrayList a = new ArrayList();
        assertEquals("Should return object that is being removed.", one, a.remove(0));
        assertEquals("Should return object that is being removed.", two, a.remove(0));
        assertEquals("Should return object that is being removed.", three, a.remove(0));
        assertTrue("List should be empty.", a.isEmpty());
        try {
            Object ignored = a.remove(0);
            fail("Should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }
}