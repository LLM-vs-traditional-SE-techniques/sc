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


public class CodexTest_0_4_60 { 
  @Test
    public void testAddAtIndex() {
        final List<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add(1, "2");
        assertEquals(Arrays.asList("0", "2", "1"), list);
    }
}