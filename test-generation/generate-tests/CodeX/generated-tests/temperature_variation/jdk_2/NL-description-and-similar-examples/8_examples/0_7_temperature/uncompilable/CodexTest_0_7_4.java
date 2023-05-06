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


public class CodexTest_0_7_4 { 
  @Test
    public void testContains() {
    	MyArrayList<String> l = new MyArrayList<String>();
    	l.add(0, "1");
    	l.add(1, "2");
    	l.add(2, "3");
    	l.add(3, "4");
    	l.add(4, "5");
    	assertTrue(l.contains("1"));
    	assertTrue(l.contains("3"));
    	assertFalse(l.contains("6"));
    }
}