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


public class CodexTest_0_8_2 { 
    @Test
	public void testContains() {
		assertTrue("container should contain 1", container.contains(1));
		assertTrue("container should contain 2", container.contains(2));
		assertTrue("container should contain 3", container.contains(3));
		assertFalse("container should not contain 4", container.contains(4));
	}
}