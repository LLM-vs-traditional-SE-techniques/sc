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


public class CodexTest_0_9_50 { 
    @Test
    public void testContains() {
        assertTrue(list.contains(A));
        assertTrue(list.contains(null));
        assertTrue(list.contains(list.get(0)));
        assertTrue(list.contains(list.get(2)));
        assertFalse(list.contains(C));
    }
}