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


public class CodexTest_0_6_97 { 
  @Test
    public void testContains() {
        assertFalse("List should not contain null", list.contains(null));
        assertFalse("List should not contain foo", list.contains("foo"));
        assertTrue("List should contain bar", list.contains("bar"));
        assertTrue("List should contain baz", list.contains("baz"));
        assertFalse("List should not contain quux", list.contains("quux"));
    }
}