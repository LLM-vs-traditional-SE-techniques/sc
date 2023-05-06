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


public class CodexTest_0_9_81 { 
  @Test
    public void testObjectRemove() {
        String string = "abcd";
        StringBuilder builder = new StringBuilder(string);
        StringBuilder expected;
        expected = new StringBuilder(string.substring(0, 2));
        expected.append(string.substring(3));
        builder.delete(2, 3);
        Assert.assertEquals(toString(expected), toString(builder));
}