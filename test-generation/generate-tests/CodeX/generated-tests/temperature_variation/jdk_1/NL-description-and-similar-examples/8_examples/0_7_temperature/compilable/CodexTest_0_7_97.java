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


public class CodexTest_0_7_97 { 
  @Test
    public void testRemoveByIdx() {
        Object[] a = { "foo", "bar", "baz" };
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(a);
        list.add(2);
        assertEquals(2, list.remove(2));
    }
}