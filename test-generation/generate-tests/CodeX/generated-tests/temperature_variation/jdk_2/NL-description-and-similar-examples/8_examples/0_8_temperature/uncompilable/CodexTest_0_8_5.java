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


public class CodexTest_0_8_5 { 
  @Test
    public void testContains() {
        assertTrue(v.contains(0));
        assertTrue(v.contains(1));
        assertTrue(v.contains(2));
        assertTrue(v.contains(3));
        assertFalse(v.contains(4));
    }
}