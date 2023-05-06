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


public class CodexTest_0_8_10 { 
        @Test
        public void testContains() {
            final Vector3D v1 = new Vector3D(-1, 0, 0);
            final Vector3D v2 = new Vector3D(0, 1, 0);
            final Vector3D v3 = new Vector3D(0, 0, 1);
            final SparseGradient sg = new SparseGradient(v1, v2, v3);
            Assert.assertTrue(sg.contains(FastMath.sqrt(1. / 3.)));
            Assert.assertTrue(sg.contains(-FastMath.sqrt(1. / 3.)));
            Assert.assertTrue(sg.contains(+FastMath.sqrt(1. / 3.)));
            Assert.assertFalse(sg.contains(0));
            Assert.assertFalse(sg.contains(Double.NaN));
        }
}