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


public class CodexTest_0_6_2 { 
  @Test
    public void testEqual() {
        Path p1 = new Path(1,2,3);
        Path p2 = new Path(1,2,3);
        Path p3 = new Path(1,2,4);
        assertEquals(p1.equals(p2), true);
        assertEquals(p1.equals(p3), false);
    }
}