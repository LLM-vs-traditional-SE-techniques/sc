import org.graphstream.graph.*;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.logging.Logger;
import java.util.stream.Stream;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.DefaultGraph;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
    @Test
    public final void shouldMakeEqualsReflexive() {
        {
            final Path<Integer> path1 = new Path<Integer>();
            final Path<Integer> path2 = new Path<Integer>();
            assertTrue(path1.equals(path2));
        }
    }
    @Test
    public final void shouldMakeEqualsSymmetric() {
        {
            final Path<Integer> path1 = new Path<Integer>();
            final Path<Integer> path2 = new Path<Integer>();
            assertTrue(path1.equals(path2));
            assertTrue(path2.equals(path1));
        }
        {
            final Path<Integer> path1 = new Path<Integer>();
            path1.add(Integer.valueOf(1));
            final Path<Integer> path2 = new Path<Integer>();
            path2.add(Integer.valueOf(2));
            assertFalse(path1.equals(path2));
            assertFalse(path2.equals(path1));
        }
        {
            final Path<Integer> path1 = new Path<Integer>();
            path1.add(Integer.valueOf(1));
            final Path<Integer> path2 = new Path<Integer>();
            path2.add(Integer.valueOf(1));
            assertTrue(path1.equals(path2));
            assertTrue(path2.equals(path1));
        }
        {
            final Path<Integer> path1 = new Path<Integer>();
            path1.add(Integer.valueOf(1));
            path1.add(Integer.valueOf(2));
            final Path<Integer> path2 = new Path<Integer>();
            path2.add(Integer.valueOf(1));
            path2.add(Integer.valueOf(2));
            assertTrue(path1.equals(path2));
            assertTrue(path2.equals(path1));
        }
        {
            final Path<Integer> path1 = new Path<Integer>();
            path1.add(Integer.valueOf(1));

}