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


public class CodexTest_0_7_4 { 
  @Test
    public void testContains_Object_NotFound() {
        assertFalse(set.contains(null));
        assertFalse(set.contains("a"));
        assertFalse(set.contains("b"));
        assertFalse(set.contains("c"));
        assertFalse(set.contains("d"));
        assertFalse(set.contains("e"));
        assertFalse(set.contains("f"));
    }
}