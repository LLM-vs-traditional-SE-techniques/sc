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


public class CodexTest_0_8_64 { 
  @Test
  public void testRemoveRange() {
    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
      al.add(i);
    }
    // remove index in range should succeed
    al.remove(2);
    assertEquals(19, al.size());
    assertEquals(Arrays.asList(0, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19), al);
  }
}