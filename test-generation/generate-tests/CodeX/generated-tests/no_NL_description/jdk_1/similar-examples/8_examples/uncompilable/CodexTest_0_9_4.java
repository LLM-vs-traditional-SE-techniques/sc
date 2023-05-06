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


public class CodexTest_0_9_4 { 
  @Test
            String[] a = new String[10];
      String[] b = new String[] { "a", "b", "c" };
      for (int i = 0; i < b.length; i++) {
        a[i] = b[i];
      }
      a[3] = "d";
      a[4] = "e";
      a[5] = "f";
      a[6] = "g";
      a[7] = "h";
      a[8] = "i";
      a[9] = "j";
      String[] list2 = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
      Arrays.fill(list2, 0);
      assertArrayEquals(list2, a);
      List<String> list = new ArrayList<>();
      Arrays.fill(a, list);
      assertEquals(10, list.size());
      assertEquals("", list.get(0));
      assertEquals("", list.get(1));
      assertEquals("", list.get(2));
      assertEquals("", list.get(3));
      assertEquals("", list.get(4));
      assertEquals("", list.get(5));
      assertEquals("", list.get(6));
      assertEquals("", list.get(7));
      assertEquals("", list.get(8));
      assertEquals("", list.get(9));
      assertThrows(ArrayIndexOutOfBoundsException.class, () -> Arrays.fill(a, -1, list));
      assertThrows(ArrayIndexOutOfBoundsException.class, () -> Arrays.fill(a, 0, -1, list));
      assertThrows(ArrayIndexOutOfBoundsException.class,
              () -> Arrays.fill(a, 0, a.length + 1, list));
      assertThrows(ArrayIndexOutOfBoundsException.class, () -> Arrays.fill(a, -1, a.length, list));
     
}