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


public class CodexTest_0_8_21 { 
  @Test
    public void removeIntIndex() {
        List<String> list = new ArrayList<String>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        assertEquals(list.size(), 8);
        assertEquals(list.get(0), "0");
        assertEquals(list.get(1), "1");
        assertEquals(list.get(2), "2");
        assertEquals(list.get(3), "3");
        assertEquals(list.get(4), "4");
        assertEquals(list.get(5), "5");
        assertEquals(list.get(6), "6");
        assertEquals(list.get(7), "7");
}