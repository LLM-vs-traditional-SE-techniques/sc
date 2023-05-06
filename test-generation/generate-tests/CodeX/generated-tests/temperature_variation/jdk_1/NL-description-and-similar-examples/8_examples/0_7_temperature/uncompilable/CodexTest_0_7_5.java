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


public class CodexTest_0_7_5 { 
  @Test
    public void testRemoveElementAt() {
        a1.add("0");
        a1.add("1");
        a1.add("2");
        a1.add("3");
        a1.add("4");
        a1.add("5");
        a1.add("6");
        a1.add("7");
        a1.add("8");
        a1.add("9");
        a1.remove(0);
        assertEquals("Should only have 9 elements", 9, a1.size());
        assertEquals("Removed incorrect element", "1", (String) a1.get(0));
    }
}