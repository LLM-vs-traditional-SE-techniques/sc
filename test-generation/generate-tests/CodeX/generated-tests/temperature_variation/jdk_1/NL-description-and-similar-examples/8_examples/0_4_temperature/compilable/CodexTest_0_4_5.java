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


public class CodexTest_0_4_5 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        Integer i = list.remove(1);
        assertEquals(2, i.intValue());
        assertEquals(Arrays.asList(1, 3), list);
        try {
            list.remove(42);
            fail("should throw IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException expected) {
        }
    }
}