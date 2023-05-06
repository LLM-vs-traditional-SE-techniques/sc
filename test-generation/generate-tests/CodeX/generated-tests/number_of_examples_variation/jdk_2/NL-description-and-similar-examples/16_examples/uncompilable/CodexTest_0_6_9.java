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


public class CodexTest_0_6_9 { 
  @Test
    public void testContains() {
        assertTrue("ArrayList should contain foo", al.contains("foo"));
        assertTrue("ArrayList should contain bar", al.contains("bar"));
        assertTrue("ArrayList should contain baz", al.contains("baz"));
        assertTrue("ArrayList should contain qux", al.contains("qux"));
        assertFalse("ArrayList should not contain foobar", al.contains("foobar"));
    }
}