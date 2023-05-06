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


public class CodexTest_0_3_4 { 
  @Test
    public void testContains() {
        assertTrue(list.contains(new Integer(0)));
        assertTrue(list.contains(new Integer(1)));
        assertTrue(list.contains(new Integer(2)));
        assertTrue(list.contains(new Integer(3)));
        assertTrue(list.contains(new Integer(4)));
        assertTrue(list.contains(new Integer(5)));
        assertTrue(list.contains(new Integer(6)));
        assertTrue(list.contains(new Integer(7)));
        assertTrue(list.contains(new Integer(8)));
        assertTrue(list.contains(new Integer(9)));
        assertFalse(list.contains(new Integer(10)));
    }
}