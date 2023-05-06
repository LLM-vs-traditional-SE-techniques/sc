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


public class CodexTest_0_3_32 { 
  @Test
    public void testRemove() {
        assertEquals(new Integer(2), list.remove(1));
        assertEquals(Arrays.asList(new Integer[] { 1, 3 }), list);
        assertEquals(new Integer(1), list.remove(0));
        assertEquals(Arrays.asList(new Integer[] { 3 }), list);
        assertEquals(new Integer(3), list.remove(0));
        assertEquals(Arrays.asList(new Integer[] {}), list);
    }
}