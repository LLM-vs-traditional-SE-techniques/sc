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


public class CodexTest_0_9_51 { 
  @Test
    public void testAdoptMultiple() {
        IstariMaps maps = new IstariMaps();
        IstariMaps maps2 = new IstariMaps();
        IstariMap map1 = new IstariMap("map1");
        IstariMap map2 = new IstariMap("map2");
        IstariMap map3 = new IstariMap("map2");
        IstariMap map4 = new IstariMap("map2");
        IstariMap map5 = new IstariMap("map2");
        IstariMap map6 = new IstariMap("map2");
        maps.add(map1);
        maps.add(map2);
        maps.add(map3);
        maps.add(map4);
        maps.add(map5);
        maps.add(map6);
        maps2.add(map1);
        maps2.add(map2);
        assertTrue(maps.contains(map1));
        assertTrue(maps.contains(map2));
        assertTrue(maps.contains(map3));
        assertTrue(maps.contains(map4));
        assertTrue(maps.contains(map5));
        assertTrue(maps.contains(map6));
        assertTrue(maps2.contains(map1));
        assertTrue(maps2.contains(map2));
        maps2.adoptMultiple(maps);
        assertFalse(maps.contains(map1));
        assertFalse(maps.contains(map2));
        assertFalse(maps.contains(map3));
        assertFalse(maps.contains(map4));
        assertFalse(maps.contains(map5));
        assertFalse(maps.contains(map6));
        assertTrue(maps2.contains(map1));
        assertTrue(maps2.contains(map2));
        assertTrue(maps2.contains(map3));
        assertTrue(maps2.contains(map4));
        assertTrue(maps2.contains(map5));
        assertTrue(maps2.contains(map6));

}