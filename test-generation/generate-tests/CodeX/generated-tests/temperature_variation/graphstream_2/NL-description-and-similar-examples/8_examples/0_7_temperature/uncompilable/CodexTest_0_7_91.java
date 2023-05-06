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


public class CodexTest_0_7_91 { 
  @Test
    public static void booleanTest37() {
			List<Node> l1 = new ArrayList<Node>();
			List<Node> l2 = new ArrayList<Node>();
			Graph g = new DefaultGraph("g");
			g.addNode("a");
			g.addNode("b");
			g.addNode("c");
			g.addNode("d");
			g.addEdge("ab", "a", "b");
			g.addEdge("bc", "b", "c");
			g.addEdge("cd", "c", "d");
			Path p1 = new Path(g.getNode("a"));
			p1.add(g.getEdge("ab"));
			l1.add(g.getNode("a"));
			l2.add(g.getNode("a"));
			l1.add(g.getNode("b"));
			l2.add(g.getNode("b"));
			Path p2 = new Path(l1);
			Path p3 = new Path(l2);
			System.out.println(p2.equals(p3));
		}
}