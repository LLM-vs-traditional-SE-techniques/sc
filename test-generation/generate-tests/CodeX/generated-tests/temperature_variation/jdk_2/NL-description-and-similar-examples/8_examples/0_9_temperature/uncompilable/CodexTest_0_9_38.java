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


public class CodexTest_0_9_38 { 
  @Test
    public void testContains() {
        Set s = new ArraySet();
        assertTrue(s.isEmpty());
        s.add(new Integer(1));  s.add(new Integer(2));
        assertFalse(s.isEmpty());
        assertTrue(s.contains(new Integer(1)));
        assertTrue(s.contains(new Integer(2)));
    }
}