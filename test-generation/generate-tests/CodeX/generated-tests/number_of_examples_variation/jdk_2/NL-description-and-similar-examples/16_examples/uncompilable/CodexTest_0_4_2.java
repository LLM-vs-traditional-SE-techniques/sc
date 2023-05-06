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


public class CodexTest_0_4_2 { 
  @Test
    public void testContains() {
        assertTrue(list.contains("a"));
        assertTrue(list.contains("b"));
        assertTrue(list.contains("c"));
        assertTrue(list.contains("d"));
        assertTrue(list.contains("e"));
        assertTrue(list.contains("f"));
        assertTrue(list.contains("g"));
        assertTrue(list.contains("h"));
        assertTrue(list.contains("i"));
        assertTrue(list.contains("j"));
        assertTrue(list.contains("k"));
        assertTrue(list.contains("l"));
        assertTrue(list.contains("m"));
        assertTrue(list.contains("n"));
        assertTrue(list.contains("o"));
        assertTrue(list.contains("p"));
        assertTrue(list.contains("q"));
        assertTrue(list.contains("r"));
        assertTrue(list.contains("s"));
        assertTrue(list.contains("t"));
        assertTrue(list.contains("u"));
        assertTrue(list.contains("v"));
        assertTrue(list.contains("w"));
        assertTrue(list.contains("x"));
        assertTrue(list.contains("y"));
        assertTrue(list.contains("z"));
        assertFalse(list.contains("0"));
        assertFalse(list.contains("1"));
        assertFalse(list.contains("2"));
        assertFalse(list.contains("3"));
        assertFalse(list.contains("4"));
        assertFalse(list.contains("5"));
        assertFalse(list.contains("6"));
        assertFalse(list.contains("7"));
        assertFalse(list.contains("8"));
        assertFalse(list.contains("9"));
    }
}