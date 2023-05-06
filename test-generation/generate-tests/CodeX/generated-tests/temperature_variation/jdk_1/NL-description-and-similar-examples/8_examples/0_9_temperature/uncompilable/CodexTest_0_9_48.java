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


public class CodexTest_0_9_48 { 
  @Test
    public void testAddOneElementQuickly() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.addAll(list);
        assertEquals(1, list.remove(1));
    }
}