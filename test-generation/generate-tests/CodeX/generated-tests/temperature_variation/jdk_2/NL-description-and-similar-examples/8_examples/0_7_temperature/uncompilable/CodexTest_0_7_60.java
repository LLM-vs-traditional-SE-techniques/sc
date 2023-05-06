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


public class CodexTest_0_7_60 { 
  @Test
    public void testContainsShouldReturnFalseWhenNotPresent() {
        // given
        TestEntity entity = new TestEntity();
        entity.setId(1L);
        entity.setName("name");
        entity.setDescription("description");
        // when
        boolean result = entity.contains(new Object());
        // then
        assertFalse(result);
    }
}