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


public class CodexTest_0_7_65 { 
  @Test
    public void testRemove() {
        IntList list = new IntArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(0);
        assertThat(list, contains(2, 3));
    }
}