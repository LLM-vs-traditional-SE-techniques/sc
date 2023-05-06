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


public class CodexTest_0_9_57 { 
  @Test
     public void testContainsNA() {
        Set set = new HashSet();
        set.add(new Integer(1));
        set.add(new Integer(2));
        set.add(new Integer(3));
        set.add(new Integer(4));
        assertTrue(set.contains(new Integer(2)));
        assertFalse(set.contains(new Integer(5)));
        assertFalse(set.contains(new Integer(0)));
    }
}