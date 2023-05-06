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


public class CodexTest_0_5_85 { 
  @Test
    public void testRemove() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(0, (int) list.remove(0));
        assertEquals(1, (int) list.remove(0));
        assertEquals(2, (int) list.remove(0));
        assertEquals(3, (int) list.remove(0));
        assertEquals(4, (int) list.remove(0));
    }
}