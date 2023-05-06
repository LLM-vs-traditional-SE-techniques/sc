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
    public void testRemove() {
        Object[] a = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" };
        ArrayList<Object> l = new ArrayList<Object>(Arrays.asList(a));
        l.remove(5);
        assertEquals("[A, B, C, D, E, G, H, I, J, K]", l.toString());
        l.remove(0);
        assertEquals("[B, C, D, E, G, H, I, J, K]", l.toString());
        l.remove(8);
        assertEquals("[B, C, D, E, G, H, I, J]", l.toString());
        l.remove(l.size() - 1);
        assertEquals("[B, C, D, E, G, H, I]", l.toString());
        l.remove(3);
        assertEquals("[B, C, D, G, H, I]", l.toString());
    }
}