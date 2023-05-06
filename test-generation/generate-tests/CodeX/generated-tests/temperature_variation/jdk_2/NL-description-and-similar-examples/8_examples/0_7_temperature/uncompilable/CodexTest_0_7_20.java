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


public class CodexTest_0_7_20 { 
  @Test
    public void testContains() {
        assertTrue(list.contains(x));
        assertTrue(list.contains(y));
        assertTrue(list.contains(z));
        assertFalse(list.contains(null));
        assertFalse(list.contains(10));
        assertFalse(list.contains(Integer.valueOf(10)));
    }
}