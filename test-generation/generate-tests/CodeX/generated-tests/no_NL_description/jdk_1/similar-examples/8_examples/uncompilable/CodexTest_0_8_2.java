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


public class CodexTest_0_8_2 { 
  @Test
      public void testZeroMaxArraySize() {
        final int zeroMaxArraySize = 0;
        final ArrayList<Integer> list = new ArrayList<>(1, zeroMaxArraySize);
        list.add(1);
        list.remove(0);
        assertEquals("is empty", 0, list.size());
      }
}