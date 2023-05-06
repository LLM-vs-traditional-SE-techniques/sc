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


public class CodexTest_0_7_92 { 
  @Test
    public void testRemoveIndex() {
        int[] data = new int[] {0,1,2,3,4};
        IntegerList list = new IntegerArrayList(data);
        int value = list.remove(0);
        assertEquals(0, value);
        assertEquals(4, list.size);
        assertEquals(1, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(3, list.get(2));
        assertEquals(4, list.get(3));
        assertEquals(4, list.get(4));
    }
}