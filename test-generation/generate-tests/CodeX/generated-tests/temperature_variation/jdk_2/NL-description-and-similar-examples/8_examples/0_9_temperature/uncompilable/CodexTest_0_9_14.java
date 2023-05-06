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


public class CodexTest_0_9_14 { 
  @Test
    public void testContains() {
        // given
        MajataloImpl underTest = new MajataloImpl();
        Soybean soybean = new Soybean(test);
        Cow cow = new Cow(test);
        underTest.doWithGoods(Arrays.asList(soybean, cow));
        // when
        boolean resultS = underTest.contains(soybean);
        boolean resultC = underTest.contains(cow);
        // then
        assertTrue(resultS);
        assertTrue(resultC);
    }
}