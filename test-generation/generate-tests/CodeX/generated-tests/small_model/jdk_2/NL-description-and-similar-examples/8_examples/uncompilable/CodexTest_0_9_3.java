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


public class CodexTest_0_9_3 { 
  @Test
    public void testContains() {
        assertFalse(Contains.contains(null, null));
        assertFalse(Contains.contains(null, new Object()));
        assertFalse(Contains.contains(new Object(), null));
        assertTrue(Contains.contains(42, 42));
        assertTrue(Contains.contains(42L, 42L));
        assertTrue(Contains.contains(42d, 42d));
    }
}