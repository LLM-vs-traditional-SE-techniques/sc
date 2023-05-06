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


public class CodexTest_0_4_22 { 
  @Test
    public void testEquals() {
        Path path = new Path();
        Path path2 = new Path();
        assertFalse(path.equals(path2));
        assertFalse(path2.equals(path));
        assertTrue(path.equals(path));
        assertTrue(path2.equals(path2));
    }
}