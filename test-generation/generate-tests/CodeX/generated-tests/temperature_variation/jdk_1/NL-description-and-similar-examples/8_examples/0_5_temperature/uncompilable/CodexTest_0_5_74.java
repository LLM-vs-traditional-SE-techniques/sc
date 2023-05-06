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


public class CodexTest_0_5_74 { 
  @Test
    public void testRemove() {
        // remove from the middle
        list.remove(1);
        assertEquals(Arrays.asList("a", "c"), list);
        // remove from the end
        list.remove(1);
        assertEquals(Arrays.asList("a"), list);
        // remove from the beginning
        list.remove(0);
        assertEquals(Arrays.asList(), list);
    }
}