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


public class CodexTest_0_9_66 { 
  @Test
    public void testContains() {
        assertTrue(list.contains(val1));
        assertTrue(list.contains(val2));
        assertTrue(list.contains(val3));
        assertFalse(list.contains(notInList));
        list = new ArrayList();
        assertFalse(list.contains(val1));
        assertFalse(list.contains(val2));
        assertFalse(list.contains(val3));
}