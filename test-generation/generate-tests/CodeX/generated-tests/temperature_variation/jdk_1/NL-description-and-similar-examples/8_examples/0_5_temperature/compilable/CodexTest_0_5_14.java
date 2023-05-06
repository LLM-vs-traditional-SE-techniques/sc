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


public class CodexTest_0_5_14 { 
  @Test
    public void testRemoveRange() {
        String[] a = { "a", "b", "c", "d", "e", "f", "g", "h" };
        ArrayList<String> al = new ArrayList<>(Arrays.asList(a));
        al.subList(1, 4).clear();
        assertEquals(Arrays.asList("a", "e", "f", "g", "h"), al);
    }
}