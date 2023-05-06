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


public class CodexTest_0_9_37 { 
  @Test
    public void testContainsObject() {
        Vector vector = new Vector();
        vector.addElement(null);
        assertTrue(vector.contains(null));
        vector = info.run(new Callable<Vector>() {
            public Vector call() {
                Vector vector = new Vector();
                vector.addElement(null);
                vector.addElement(new Object());
                return vector;
            }
        });
        assertTrue(vector.contains(vector.elementAt(1)));
    }
 */
}
}