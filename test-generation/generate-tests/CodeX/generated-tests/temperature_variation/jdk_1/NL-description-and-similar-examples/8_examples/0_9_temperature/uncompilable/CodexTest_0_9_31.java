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


public class CodexTest_0_9_31 { 
  @Test
    public void testRemove() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        assertEquals(4, list.size());
        assertEquals(list.toString(), 1, list.remove(0));
        assertEquals(list.toString(), 2, list.remove(0));
        assertEquals(list.toString(), 4, list.remove(1));
        assertEquals(list.toString(), 1, list.size());
        assertEquals(list.toString(), 3, list.remove(0));
        assertEquals(list.toString(), 0, list.size());
    }
}