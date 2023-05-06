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


public class CodexTest_0_8_2 { 
  @Test
    public void testContainsShouldReturnTrueWhenObjectFound() {
        // given
        ComponentCollection underTest = new ComponentCollection(2);
        Component component = new Component();
        // when
        int result = underTest.indexOf(component);
        // then
        assertTrue(result);
    }
}