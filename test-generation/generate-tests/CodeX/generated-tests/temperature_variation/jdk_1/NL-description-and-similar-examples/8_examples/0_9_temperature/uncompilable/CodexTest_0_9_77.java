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


public class CodexTest_0_9_77 { 
  @Test
    public void testRemove() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        assertThat(list.remove(0), is(3));
        assertThat(list.remove(0), is(10));
        assertThat(list.remove(0), is(11));
        assertThat(list.remove(0), is(12));
        assertThat(list.remove(0), is(13));
        assertThat(list, is(Collections.emptyList()));
    }
}