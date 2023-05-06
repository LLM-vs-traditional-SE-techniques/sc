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


public class CodexTest_0_8_52 { 
  @Test
    public void testContainsNull() {
        List<String> list = new RandomAccessSubList<String>(this.list, 0, 0);
        assertFalse(list.contains(null));
    }
}