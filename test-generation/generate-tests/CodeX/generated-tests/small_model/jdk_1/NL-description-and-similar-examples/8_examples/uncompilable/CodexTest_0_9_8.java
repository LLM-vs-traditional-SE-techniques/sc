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


public class CodexTest_0_9_8 { 
  @Test
    public void testRemove() {
        List<Object> list = new ArrayList<Object>();
        list.add("1");
        try {
            list.remove("1");
            assertThat(list.size(), is(0));
        } catch (ClassCastException e1) {
            // ok
        }
}