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


public class CodexTest_0_3_19 { 
  @Test
    public void testRemove() {
        for (int i = 0; i < 100; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                list.add(j);
            }
            for (int j = 0; j < i; j++) {
                assertEquals(new Integer(j), list.remove(0));
            }
        }
    }
}