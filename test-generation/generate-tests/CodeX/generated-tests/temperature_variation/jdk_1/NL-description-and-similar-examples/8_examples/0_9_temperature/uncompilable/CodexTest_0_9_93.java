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


public class CodexTest_0_9_93 { 
  @Test
    public void testSetStart() {
        ActivityManager.TaskDescription description = new ActivityManager.TaskDescription("title", null, 0);
        description.setPrimaryColor(Color.argb(1, 2, 3, 4));
        assertTrue(description.getPrimaryColor() == Color.argb(1, 2, 3, 4));
        description.setPrimaryColor(Color.argb(5, 6, 7, 8));
        assertTrue(description.getPrimaryColor() == Color.argb(5, 6, 7, 8));
        description.setPrimaryColor(ActivityManager.TaskDescription.DEFAULT_PRIMARY_COLOR);
        assertTrue(description.getPrimaryColor() == ActivityManager.TaskDescription.DEFAULT_PRIMARY_COLOR);
    }
}