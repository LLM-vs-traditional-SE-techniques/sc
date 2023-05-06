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


public class CodexTest_0_7_9 { 
  @Test
        public void testContains() {
            Path p = new Path();
            assertFalse(p.contains(e));
            assertFalse(p.contains(null));
            p.add(e);
            assertTrue(p.contains(e));
            p.remove(e);
            assertFalse(p.contains(e));
        }
}