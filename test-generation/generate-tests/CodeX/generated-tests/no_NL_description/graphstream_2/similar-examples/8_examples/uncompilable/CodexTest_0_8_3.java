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


public class CodexTest_0_8_3 { 
    @Test
   public void testHashCode() {
       final Path p1 = new Path();
       p1.add(m_graph.getNode(a));
       p1.add(m_graph.getNode(b));
       p1.add(m_graph.getNode(c));
       final Path p2 = new Path();
       p2.add(m_graph.getNode(a));
       p2.add(m_graph.getNode(b));
       p2.add(m_graph.getNode(c));
       Assert.assertEquals("Hash codes differ", (long) p1.hashCode(), (long) p2.hashCode());
   }
}