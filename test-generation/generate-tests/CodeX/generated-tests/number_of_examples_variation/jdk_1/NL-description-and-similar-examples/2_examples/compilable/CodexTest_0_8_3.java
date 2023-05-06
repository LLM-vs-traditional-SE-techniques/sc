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


public class CodexTest_0_8_3 { 
  @Test
    public void testObjectArray()
        throws Exception {
            // Regression for HARMONY-39
            Object[] objArray = new Object[2];
            objArray[0] = "1";
            objArray[1] = "2";
            List<Object> lst = new ArrayList<Object>(Arrays.asList(objArray));
            lst.remove(0);
            assertSame("1", "2", lst.get(0));
        }
}