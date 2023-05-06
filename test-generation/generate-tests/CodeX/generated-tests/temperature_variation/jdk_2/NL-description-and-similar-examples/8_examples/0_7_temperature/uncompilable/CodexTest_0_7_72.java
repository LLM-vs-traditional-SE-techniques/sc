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


public class CodexTest_0_7_72 { 
  @Test
    public void testContains() {
        final SetOfBoolean bm = new SetOfBoolean(5);
        bm.set(1);
        bm.set(2);
        bm.set(3);
        assertTrue(bm.contains(1));
        assertTrue(bm.contains(2));
        assertTrue(bm.contains(3));
        assertFalse(bm.contains(0));
        assertFalse(bm.contains(4));
        assertFalse(bm.contains(5));
    }
}