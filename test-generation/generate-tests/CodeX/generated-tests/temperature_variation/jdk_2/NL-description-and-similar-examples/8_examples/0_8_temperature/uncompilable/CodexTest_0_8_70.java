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


public class CodexTest_0_8_70 { 
  @Test
    public void testContainsShouldReturnFalseWhenObjectNotFound() {
        // given
        AlgList underTest = listFromArray(one, two, three);
        // when
        Boolean result = underTest.contains(four);
        // then
        assertFalse(result);
    }
}