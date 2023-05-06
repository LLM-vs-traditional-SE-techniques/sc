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


public class CodexTest_0_7_9 { 
  @Test
    public void testRemove() {
        MyList<String> list = new MyList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        assertEquals("Element should be removed ", "2", list.remove(1));
        assertEquals("Element should be removed ", "1", list.remove(0));
        assertEquals("Element should be removed ", "3", list.remove(0));
        assertEquals("List should be empty", 0, list.size());
    }
}