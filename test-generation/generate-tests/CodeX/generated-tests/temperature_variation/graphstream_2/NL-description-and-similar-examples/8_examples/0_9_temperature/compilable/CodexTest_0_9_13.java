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


public class CodexTest_0_9_13 { 
    @Test
	public void comparePathsWithPaths() {
		Graph g = new DefaultGraph("test");
        g.setStrict(false);
        g.setAutoCreate(true);
        Node n1 = g.addNode("n1");
        Node n2 = g.addNode("n2");
        Node n3 = g.addNode("n3");
        g.addEdge("e1", n1, n2);
        g.addEdge("e2", n2, n3);
        g.addEdge("e3", n3, n1);
        
        Path a = new Path();
        a.setRoot(n1);
        a.add(g.getEdge("e1"));
        a.add(g.getEdge("e2"));
        
        Path b = new Path();
        b.setRoot(n1);
        b.add(g.getEdge("e1"));
        b.add(g.getEdge("e2"));
        
        Path c = new Path();
        c.setRoot(n3);
        c.add(g.getEdge("e3"));
        c.add(g.getEdge("e2"));
        
        Assert.assertTrue(a.equals(b));
        Assert.assertFalse(a.equals(c));
        Assert.assertFalse(b.equals(c));
	}
}