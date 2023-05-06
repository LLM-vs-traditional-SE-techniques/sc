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


public class CodexTest_0_8_60 { 
  @Test
  public static void testRemoveRange() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.remove(0);
        ArrayList<Integer> subList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
        	subList.add(i);
        }
        subList.remove(0);
		assertEquals(list, subList);
    }
}