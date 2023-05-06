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


public class CodexTest_0_7_19 { 
  @Test
    public void testContainsNull() {
        LinkedList<Object> list = new LinkedList<Object>();
        assertFalse(list.contains(null));
        list.add(new Object());
        assertFalse(list.contains(null));
    }
}