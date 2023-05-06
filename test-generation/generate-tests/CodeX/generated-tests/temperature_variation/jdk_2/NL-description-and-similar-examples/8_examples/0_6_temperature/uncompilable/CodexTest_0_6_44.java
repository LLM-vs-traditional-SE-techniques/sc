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


public class CodexTest_0_6_44 { 
  @Test
    public void testContainsShouldReturnFalseWhenObjectIsNotInTheList() {
        // given
        SimpleList<String> underTest = new SimpleList<>();
        underTest.add(test1);
        // when
        boolean contains = underTest.contains(test2);
        // then
        assertFalse(contains);
    }
}