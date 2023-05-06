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


public class CodexTest_0_7_81 { 
  @Test
    public void testNull() {
			ArrayList<Object> list = new ArrayList<Object>();
			list.add(null);
			list.add(1);
			list.remove(list.size() - 1);
			assert list.size() == 1;
			assert list.get(0) == null;
		}
}