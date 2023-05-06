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


public class CodexTest_0_9_89 { 
  @Test
  public static void assertListEquals(List<Object> expecteds,
                                      List<Object> actuals) {
        if (expecteds == null) {
            Assert.assertNull(actuals);
        } else {
            Assert.assertNotNull(actuals);
            Assert.assertEquals(expecteds.size(), actuals.size());
}