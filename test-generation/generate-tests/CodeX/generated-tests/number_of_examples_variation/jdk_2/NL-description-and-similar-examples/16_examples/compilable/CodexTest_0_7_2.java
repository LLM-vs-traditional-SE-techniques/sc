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


public class CodexTest_0_7_2 { 
  @Test
    public void testContains() {
        assertTrue(new ArrayList().add(Boolean.TRUE));
        assertTrue(new ArrayList().add(Boolean.FALSE));
        assertFalse(new ArrayList().contains(Boolean.TRUE));
        assertFalse(new ArrayList().contains(Boolean.FALSE));
        assertTrue(new ArrayList().containsAll(Arrays.asList(Boolean.TRUE, Boolean.FALSE)));
    }
}