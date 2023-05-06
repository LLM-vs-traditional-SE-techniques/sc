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


public class CodexTest_0_8_4 { 
  @Test
    public static void testRemoveUnchecked() {
        ArrayList<String> list = new ArrayList<>(3);
        list.add("zero");
        list.add("one");
        list.add("two");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            // use remove(int)
            assertEquals(list.get(i), list.remove(i));
            // this causes an IndexOutOfBoundsException to be thrown
            if (i < list.size()) {
                assertEquals(list.get(i), list.remove(i));
            }
            list.add(i, String.valueOf(i));
        }
    }
}