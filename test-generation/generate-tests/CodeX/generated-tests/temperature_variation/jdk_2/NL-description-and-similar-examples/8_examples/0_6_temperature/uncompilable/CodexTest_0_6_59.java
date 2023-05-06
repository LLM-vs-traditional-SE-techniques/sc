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


public class CodexTest_0_6_59 { 
  @Test
    public void testContains() {
        assertTrue("List should contain foo", l.contains("foo"));
        assertTrue("List should contain bar", l.contains("bar"));
        assertFalse("List should not contain baz", l.contains("baz"));
        assertFalse("List should default contain null", l.contains(null));
    }
}