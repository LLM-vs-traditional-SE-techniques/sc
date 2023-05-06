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


public class CodexTest_0_8_44 { 
  @Test
    public void tesIndexOfObject() {
        Vector<String> vector = new Vector<String>(1);
        vector.add(null);
        vector.add("one");
        vector.add("two");
        assertFalse(vector.indexOf("four") == 0);
    }
}