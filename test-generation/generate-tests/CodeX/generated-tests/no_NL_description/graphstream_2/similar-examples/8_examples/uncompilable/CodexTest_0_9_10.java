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


public class CodexTest_0_9_10 { 
  @Test
   public void testIsPathEqualTo() {
			Node a = new Node(a);
			Node b = new Node(b);
			Node c = new Node(c);
			Node d = new Node(d);
			Path p1 = new Path(a, b, c, d);
			Path p2 = new Path(a, b, c, d);
			Path p3 = new Path(a, b, d);
			Path p4 = new Path(a, c, b, d);
			Path p5 = new Path();
			Path p6 = new Path();
			// ===
			Assert.assertEquals(p1, p2);
			Assert.assertNotSame(p1, p2);
			Assert.assertNotSame(p1, p3);
			Assert.assertNotSame(p1, p4);
			Assert.assertNotSame(p3, p4);
			Assert.assertNotSame(p5, p6);
		}
}