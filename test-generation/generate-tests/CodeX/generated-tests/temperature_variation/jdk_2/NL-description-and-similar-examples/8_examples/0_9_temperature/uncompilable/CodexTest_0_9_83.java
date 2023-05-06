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


public class CodexTest_0_9_83 { 
  @Test
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		assertTrue(underTest.contains(true));
		assertFalse(underTest.contains(false));
		assertFalse(underTest.contains(true));
		assertTrue(underTest.contains(false));
		assertFalse(underTest.contains(true));
		assertTrue(underTest.contains(false));
}