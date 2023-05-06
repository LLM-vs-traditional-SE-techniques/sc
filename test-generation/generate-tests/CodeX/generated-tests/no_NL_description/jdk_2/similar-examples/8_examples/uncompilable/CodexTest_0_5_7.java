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


public class CodexTest_0_5_7 { 
  @Test
  public void testContains() {
        assertTrue("contains", l.contains("A"));
        assertTrue("contains", l.contains("E"));
        assertTrue("contains", l.contains("I"));
        assertTrue("contains", l.contains("O"));
        assertTrue("contains", l.contains("U"));
        assertFalse("contains", l.contains("K"));
        assertFalse("contains", l.contains("Z"));
    }
}