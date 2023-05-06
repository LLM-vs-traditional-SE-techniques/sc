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


public class CodexTest_0_7_76 { 
  @Test
   public void testRemove() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.remove(0);
        list.remove(0);
        assertEquals(0, list.size());
    }
}