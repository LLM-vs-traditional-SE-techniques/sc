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


public class CodexTest_0_5_3 { 
  @Test
          public void testRemove() {
        String[] data = {"A", "B", "C", "D", "E", "F"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(data));
        list.remove(0);
        assertEquals("B", list.get(0));
        list.remove(list.size() - 1);
        assertEquals("E", list.get(list.size() - 1));
    }
}