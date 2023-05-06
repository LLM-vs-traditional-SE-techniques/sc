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


public class CodexTest_0_6_30 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3));
        assertEquals(new Integer(2), l.remove(1));
        assertEquals(new ArrayList<>(Arrays.asList(1, 3)), l);
        assertEquals(new Integer(1), l.remove(0));
        assertEquals(new ArrayList<>(Arrays.asList(3)), l);
        assertEquals(new Integer(3), l.remove(0));
        assertEquals(new ArrayList<>(), l);
    }
}