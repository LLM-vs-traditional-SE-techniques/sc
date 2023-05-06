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


public class CodexTest_0_6_5 { 
  @Test
    public void testRemove() {
        // given
        ArrayList<Integer> underTest = new ArrayList<>();
        underTest.add(1);
        underTest.add(2);
        underTest.add(3);
        // when
        Integer result = underTest.remove(1);
        // then
        assertEquals(2, result.intValue());
        assertEquals(2, underTest.size());
        assertEquals(3, underTest.get(1).intValue());
    }

}