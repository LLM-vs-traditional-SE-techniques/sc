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


public class CodexTest_0_6_60 { 
  @Test
  public void testRemove() {
        MyList<Integer> list = new MyList<>(new Integer[] {1, 2, 3, 4, 5});
        assertEquals(Integer.valueOf(5), list.remove(4));
        assertEquals(Integer.valueOf(4), list.remove(3));
        assertEquals(Integer.valueOf(3), list.remove(2));
        assertEquals(Integer.valueOf(2), list.remove(1));
        assertEquals(Integer.valueOf(1), list.remove(0));
        assertEquals(0, list.size());
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(0));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-1));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(Integer.MAX_VALUE));
        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(Integer.MIN_VALUE));
    }
```
}