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


public class CodexTest_0_4_19 { 
  @Test
    public void testRemove() {
        assertEquals("Should remove element at index 0", new Integer(2), list.remove(0));
        assertEquals("Should remove element at index 2", new Integer(4), list.remove(2));
        assertEquals("Should remove element at index 0", new Integer(1), list.remove(0));
        assertEquals("Should remove element at index 0", new Integer(3), list.remove(0));
        assertTrue("List should be empty", list.isEmpty());
    }
}