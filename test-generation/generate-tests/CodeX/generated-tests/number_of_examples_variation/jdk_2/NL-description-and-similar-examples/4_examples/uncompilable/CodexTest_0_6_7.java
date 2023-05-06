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


public class CodexTest_0_6_7 { 
  @Test
  public void testContains() {
        List<E> l = createEmptyList();
        l.add(createElement(0));
        assertTrue(l.contains(createElement(0)));
        assertFalse(l.contains(createElement(1)));
    }
}