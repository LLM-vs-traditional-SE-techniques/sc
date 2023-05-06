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


public class CodexTest_0_8_77 { 
  @Test
    /**
     * Verify that two equal paths are truly equal.
     */
    public void testEquality() {
        Path path1 = createPath();
        Path path2 = createPath();
        Path path3 = createPath();
        Path path4 = createPath();
        assertTrue(path1.equals(path2));
        assertTrue(path2.equals(path1));
        path3.add(null);
        assertFalse(path1.equals(path3));
        assertFalse(path3.equals(path1));
        path4.add(new Edge());
        assertFalse(path1.equals(path4));
        assertFalse(path4.equals(path1));
    }
    public void testEquality1() {
        Path path1 = createPath();
        Path path2 = createPath();
        Path path3 = createPath();
        Path path4 = createPath();
        assertTrue(path1.equals(path2));
        assertTrue(path2.equals(path1));
        path3.add(null);
        assertFalse(path1.equals(path3));
        assertFalse(path3.equals(path1));
        path4.add(new Edge());
        assertFalse(path1.equals(path4));
        assertFalse(path4.equals(path1));
    }
}