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


public class CodexTest_0_6_80 { 
  @Test
    public void testContains() {
        Vector<Integer> v = new Vector<Integer>(Arrays.asList(1, 2, 3, 4));
        assertTrue(v.contains(2));
        assertFalse(v.contains(6));
    }
}