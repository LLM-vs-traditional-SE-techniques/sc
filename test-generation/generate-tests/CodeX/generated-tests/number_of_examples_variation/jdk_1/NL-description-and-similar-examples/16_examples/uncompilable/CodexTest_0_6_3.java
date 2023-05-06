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


public class CodexTest_0_6_3 { 
  @Test
    public void testRemoveFromEmpty() {
        final Object[] es = elementData(new ArrayList<Object>());
        final int size = es.length;
        try {
            List.class.cast(new ArrayList<Object>()).remove(0);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            assertThat(e.getMessage(), equalTo("Index: 0, Size: 0"));
        }
    }

}