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


public class CodexTest_0_9_99 { 
  @Test
    public void testNullElementIsConsideredAsValidElement() {
        final Grid grid = new Grid(2, 3);
        grid.setWidget(0, 0, new Label("1"));
        grid.setWidget(0, 1, new Label("2"));
        grid.setWidget(0, 2, new Label("3"));
        grid.setWidget(1, 0, null);
        grid.setWidget(1, 1, new Label("5"));
        grid.setWidget(1, 2, new Label("6"));
        assertTrue(grid.contains(null));
    }
}