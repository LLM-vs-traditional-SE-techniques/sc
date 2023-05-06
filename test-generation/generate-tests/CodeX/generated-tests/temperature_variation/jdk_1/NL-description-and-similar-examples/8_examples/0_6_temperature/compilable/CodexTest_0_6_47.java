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


public class CodexTest_0_6_47 { 
  @Test
    public void testRemoveObject() {
        // Regression test for HARMONY-521
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("ten");
        list.add("eleven");
        list.add("twelve");
        list.add("thirteen");
        list.add("fourteen");
        list.add("fifteen");
        list.add("sixteen");
        list.add("seventeen");
        list.add("eighteen");
        list.add("nineteen");
        list.add("twenty");
        list.remove("one");
        list.remove("two");
        list.remove("three");
        list.remove("four");
        list.remove("five");
        list.remove("six");
        list.remove("seven");
        list.remove("eight");
        list.remove("nine");
        list.remove("ten");
        list.remove("eleven");
        list.remove("twelve");
        list.remove("thirteen");
        list.remove("fourteen");
        list.remove("fifteen");
        list.remove("sixteen");
        list.remove("seventeen");
        list.remove("eighteen");
        list.remove("nineteen");
        list.remove("twenty");
        assertEquals("Should be empty", 0, list.size());
    }
}