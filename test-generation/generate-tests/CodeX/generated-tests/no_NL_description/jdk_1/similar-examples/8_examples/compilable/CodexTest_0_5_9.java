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


public class CodexTest_0_5_9 { 
  @Test
    public void testRemoveInt() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            list.add(i);
        }
        for (int i = 0; i < 10; ++i) {
            list.remove(i);
            assertEquals(9 - i, list.size());
            assertEquals(Integer.valueOf(i), list.remove(0));
        }
    }
}