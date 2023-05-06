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


public class CodexTest_0_7_71 { 
  @Test
    public void testElements() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        list.add(0, 4);
        list.add(0, 5);
        try {
            list.add(null);
            fail("add(null)");
        } catch (NullPointerException e) {
        }
        list.remove(0);
        assertEquals(4, list.size());
        assertEquals("[4, 3, 2, 1]", list.toString());
    }
}