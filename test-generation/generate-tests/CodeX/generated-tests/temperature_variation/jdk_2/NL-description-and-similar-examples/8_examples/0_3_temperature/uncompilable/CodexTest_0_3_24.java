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


public class CodexTest_0_3_24 { 
  @Test
    public void testContains() {
        assertFalse(list.contains(null));
        assertFalse(list.contains("foo"));
        assertFalse(list.contains("bar"));
        assertFalse(list.contains("baz"));
        assertFalse(list.contains("qux"));
        assertFalse(list.contains("quux"));
        assertFalse(list.contains("corge"));
        assertFalse(list.contains("grault"));
        assertFalse(list.contains("garply"));
        assertFalse(list.contains("waldo"));
        assertFalse(list.contains("fred"));
        assertFalse(list.contains("plugh"));
        assertFalse(list.contains("xyzzy"));
        assertFalse(list.contains("thud"));
    }
}