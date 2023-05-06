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


public class CodexTest_0_7_52 { 
  @Test
    public void testRemove() {
        Vector<String> v = new Vector<String>();
        v.add("A");
        v.add("B");
        v.add("C");
        assertEquals("A", v.remove(0));
        assertEquals("B", v.remove(0));
        assertEquals("C", v.remove(0));
    }
}