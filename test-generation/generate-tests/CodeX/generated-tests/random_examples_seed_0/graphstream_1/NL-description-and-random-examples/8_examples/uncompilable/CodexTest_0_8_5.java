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


public class CodexTest_0_8_5 { 
  @Test
                public void testContains() {
                Edge e1 = new Edge(1, 2, 0);
                Edge e2 = new Edge(1, 2, 0);
                boolean b1 = e1.contains(e2);
                System.out.println("b1 = "+ b1);
                assertTrue(b1);
        }
}