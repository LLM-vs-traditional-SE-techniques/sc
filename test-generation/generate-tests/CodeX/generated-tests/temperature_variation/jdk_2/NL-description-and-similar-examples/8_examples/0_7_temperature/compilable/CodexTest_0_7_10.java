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


public class CodexTest_0_7_10 { 
  @Test
    public void testContains() {
        Vector<String> list = new Vector<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        assertFalse(list.contains("one"));
        assertFalse(list.contains("three"));
        assertFalse(list.contains("two"));
    }
}