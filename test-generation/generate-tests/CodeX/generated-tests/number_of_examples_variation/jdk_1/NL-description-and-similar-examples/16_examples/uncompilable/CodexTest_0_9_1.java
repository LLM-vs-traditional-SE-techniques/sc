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


public class CodexTest_0_9_1 { 
  @Test
    public void testSizeAfterRemove() {
			final ArrayList<String> list = new ArrayList<String>();
			list.add(a);
			list.add(b);
			list.remove(0);
			assertEquals(1, list.size());
		}
}