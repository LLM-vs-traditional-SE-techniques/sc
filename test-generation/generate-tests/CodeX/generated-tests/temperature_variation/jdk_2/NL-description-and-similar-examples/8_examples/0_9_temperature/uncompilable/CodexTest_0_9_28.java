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


public class CodexTest_0_9_28 { 
  @Test
    public void testContains() {
        Vector3D v1 = new Vector3D(0, 1, 0);
        Vector3D v2 = new Vector3D(1, 0, 0);
        Vector3D v12 = new Vector3D(1, 1, 0);
        Rotation r1 = new Rotation(v1, 1);
        Rotation r2 = new Rotation(v2, 2);
        Rotation r12 = new Rotation(v12, 1);
        Rotation r21 = new Rotation(v2, 1);
        Rotation r22 = new Rotation(v2, 2);
        Assert.assertTrue(r1.contains(v1));
        Assert.assertTrue(r2.contains(v2));
        Assert.assertFalse(r1.contains(v2));
        Assert.assertFalse(r2.contains(v1));
        Assert.assertFalse(r12.contains(v1));
        Assert.assertFalse(r12.contains(v2));
        Assert.assertFalse(r12.contains(v12));
        Assert.assertFalse(r21.contains(v1));
        Assert.assertFalse(r22.contains(v1));
        Assert.assertFalse(r12.contains(null));
    }
}