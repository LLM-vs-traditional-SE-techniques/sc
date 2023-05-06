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


public class CodexTest_0_5_26 { 
  @Test
    public void testContains() {
        assertTrue(list.contains(Integer.valueOf(0)));
        assertTrue(list.contains(Integer.valueOf(1)));
        assertTrue(list.contains(Integer.valueOf(2)));
        assertTrue(list.contains(Integer.valueOf(3)));
        assertTrue(list.contains(Integer.valueOf(4)));
        assertFalse(list.contains(Integer.valueOf(5)));
    }
}