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


public class CodexTest_0_9_55 { 
  @Test
        public void testEquals() {
            Path p = new Path();
            p.setRoot(new GraphNode());
            GraphNode n = new GraphNode();
            p.add(nv);
            p.add(nv);
            p.add(nv);
            Assert.assertTrue(p.equals(p));
            Assert.assertFalse(p.equals(null));
        }
}