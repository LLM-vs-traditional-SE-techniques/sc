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


public class CodexTest_0_5_15 { 
  @Test
        public void testRemove() {
        String[] data = new String[]{"1", "2", "3", "4"};
        List<String> list = new ArrayList<>(Arrays.asList(data));
        String removed = list.remove(1);
        assertThat(removed, is("2"));
        assertThat(list, hasSize(3));
        assertThat(list, hasItems(data[0], data[2], data[3]));
    }
}