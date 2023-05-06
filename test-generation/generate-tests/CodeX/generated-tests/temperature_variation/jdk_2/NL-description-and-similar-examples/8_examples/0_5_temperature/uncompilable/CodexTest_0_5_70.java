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


public class CodexTest_0_5_70 { 
  @Test
    public void testContains() {
        BidiLinkedList<String> list = new BidiLinkedList<>();
        assertFalse(list.contains("A"));
        list.add("A");
        assertTrue(list.contains("A"));
        list.add("B");
        assertTrue(list.contains("B"));
        assertFalse(list.contains("C"));
    }
}