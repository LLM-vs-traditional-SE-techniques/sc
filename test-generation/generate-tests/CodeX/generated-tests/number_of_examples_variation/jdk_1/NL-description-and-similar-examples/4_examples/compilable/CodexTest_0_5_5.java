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


public class CodexTest_0_5_5 { 
  @Test
    public void testRemove() {
        ArrayList<String> l = new ArrayList<>();
        l.add("a");
        assertEquals("a", l.remove(0));
        l.add("b");
        l.add("c");
        assertEquals("b", l.remove(0));
        assertEquals("c", l.remove(0));
    }
}