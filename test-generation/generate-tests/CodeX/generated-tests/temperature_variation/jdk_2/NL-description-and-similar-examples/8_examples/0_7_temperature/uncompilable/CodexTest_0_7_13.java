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


public class CodexTest_0_7_13 { 
  @Test
    public void testContainsFalseWhenEmptyArrayGiven() {
        // given
        ArrayBasedJsonNode underTest = new ArrayBasedJsonNode(new ArrayNode(JsonNodeFactory.instance, 0));
        // when
        boolean result = underTest.contains(x);
        // then
        assertFalse(result);
    }

}