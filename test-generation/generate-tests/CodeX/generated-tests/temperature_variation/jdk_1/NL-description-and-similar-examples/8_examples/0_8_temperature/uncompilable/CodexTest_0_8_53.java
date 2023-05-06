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


public class CodexTest_0_8_53 { 
  @Test
    public void testRemove() {
			Object[] item = new Object[3];
			item[0] = "a";
			item[1] = "4";
			Vector x = new Vector(item);
			Object e = x.elementAt(2);
			x.remove(2);
			assertEquals("remove failed", x.elementAt(1), e);
		}
}