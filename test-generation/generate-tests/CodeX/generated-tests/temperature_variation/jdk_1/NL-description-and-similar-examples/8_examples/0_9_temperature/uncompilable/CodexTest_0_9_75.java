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


public class CodexTest_0_9_75 { 
  @Test
    public void testRemove2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.add("");
        list.add("C");
        assertEquals("A", list.remove(0));
        assertEquals("", list.remove(1));
        assertEquals("C", list.remove(1));
        assertEquals("A", list.remove(0));
        assertEquals(0, list.size());
    }
    private void assertData(int[] i, int size, int[] empty) {
}