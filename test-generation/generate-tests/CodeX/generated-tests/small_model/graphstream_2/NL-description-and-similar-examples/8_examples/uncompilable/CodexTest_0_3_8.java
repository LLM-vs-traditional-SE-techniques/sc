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


public class CodexTest_0_3_8 { 
    @Test
    public void testEquals() {
        Path p = new Path();
        p.add(nodeA);
        p.add(nodeB);
        p.add(nodeC);
        Path p2 = new Path();
        p2.add(nodeA);
        p2.add(nodeB);
        p2.add(nodeC);
        assertTrue(p.equals(p2));
    }

}