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


public class CodexTest_0_9_9 { 
  @Test
    public static String[] arrayToString(Object a) {
        String[] s = new String[Array.getLength(a)];
        for (int i = 0; i < s.length; i++) {
            s[i] = Array.get(a, i).toString();
        }
        return s;
    }
}