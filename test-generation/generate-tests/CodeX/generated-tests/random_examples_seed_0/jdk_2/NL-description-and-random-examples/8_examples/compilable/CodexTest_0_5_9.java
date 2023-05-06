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


public class CodexTest_0_5_9 { 
    @Test
    public void testContains() {
        Object o = new Object();
        assertFalse(new HashSet().contains(o));
        assertFalse(new HashSet(Arrays.asList(1, 2)).contains(o));
        assertTrue(new HashSet(Arrays.asList(1, 2, o)).contains(o));
    }

}