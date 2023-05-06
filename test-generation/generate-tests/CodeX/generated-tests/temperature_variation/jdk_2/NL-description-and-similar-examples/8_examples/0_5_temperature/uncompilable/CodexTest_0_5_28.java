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


public class CodexTest_0_5_28 { 
  @Test
    public void testContains() {
        assertTrue(l.contains(new Integer(0)));
        assertTrue(l.contains(new Integer(1)));
        assertTrue(l.contains(new Integer(2)));
        assertTrue(l.contains(new Integer(3)));
        assertTrue(l.contains(new Integer(4)));
        assertFalse(l.contains(new Integer(5)));
        assertFalse(l.contains(null));
    }
}