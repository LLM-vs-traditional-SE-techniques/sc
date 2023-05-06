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


public class CodexTest_0_8_67 { 
  @Test
    public void testRemoveObject() {
        ArrayList<String> l = new ArrayList<>();
        l.addAll(Arrays.asList(new String[]
            {"a", "b", "c", "d"}));
        l.remove(1);
        l.remove("d");
        l.remove(new String("b"));
        assertEquals(1, l.size());
        assertEquals("a", l.get(0));
    }
}