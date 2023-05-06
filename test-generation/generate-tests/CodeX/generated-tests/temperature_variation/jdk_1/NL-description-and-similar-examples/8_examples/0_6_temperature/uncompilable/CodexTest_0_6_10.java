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


public class CodexTest_0_6_10 { 
  @Test
  public void testIndexOf() {
        String[] a = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        ArrayList<String> al = new ArrayList<String>(Arrays.asList(a));
        assertEquals(0, al.indexOf("a"));
        assertEquals(25, al.indexOf("z"));
        assertEquals(-1, al.indexOf("A"));
        al.remove(1);
        assertEquals(0, al.indexOf("a"));
        assertEquals(24, al.indexOf("z"));
        assertEquals(-1, al.indexOf("A"));
}