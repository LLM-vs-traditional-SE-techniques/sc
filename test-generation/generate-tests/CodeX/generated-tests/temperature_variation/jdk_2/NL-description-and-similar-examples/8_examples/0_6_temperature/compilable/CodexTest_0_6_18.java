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


public class CodexTest_0_6_18 { 
  @Test
    public void testContains() {
        ArrayList list = new ArrayList();
        assertFalse(list.contains("foo"));
        list.add("a");
        list.add("b");
        assertTrue(list.contains("a"));
        assertTrue(list.contains("b"));
        assertFalse(list.contains("foo"));
    }
}