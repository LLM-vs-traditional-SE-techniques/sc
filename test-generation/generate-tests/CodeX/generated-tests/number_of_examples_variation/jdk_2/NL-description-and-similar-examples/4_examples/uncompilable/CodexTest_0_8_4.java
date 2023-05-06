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


public class CodexTest_0_8_4 { 
  @Test
    public void testContainsWithObjectExistsShouldReturnTrue() throws Exception {
        // given
        Queue<Integer> queue = new Queue<>(new Integer[]{1, 2, 3, 4, 5});
        // when
        boolean result = queue.contains(4);
        // then
        Assert.assertTrue(result);
    }
}