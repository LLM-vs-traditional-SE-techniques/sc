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


public class CodexTest_0_7_8 { 
  @Test
    public void testRemove_int() {
        this.list.add("A");
        this.list.add("B");
        this.list.add("C");
        this.list.add("D");
        this.list.add("E");
        this.list.add("F");
        this.list.add("G");
        this.list.add("H");
        this.list.add("I");
        assertEquals("C", this.list.remove(2));
        assertEquals("B", this.list.get(1));
        assertEquals("D", this.list.get(2));
        assertEquals("I", this.list.get(7));
        assertEquals("H", this.list.get(8));
        assertEquals("G", this.list.remove(7));
        assertEquals("F", this.list.remove(5));
        assertEquals("E", this.list.remove(4));
        assertEquals("D", this.list.remove(3));
        assertEquals("B", this.list.remove(1));
        assertEquals("A", this.list.remove(0));
        assertEquals("H", this.list.remove(0));
        assertEquals(0, this.list.size());
    }
}