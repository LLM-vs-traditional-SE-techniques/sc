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


public class CodexTest_0_8_10 { 
  @Test
        public static void testEquals() {
			Path p1 = new Path(new ArrayList<Integer>());
			p1.addNode(1);
			p1.addNode(2);
			Path p2 = new Path(new ArrayList<Integer>());
			p2.addNode(1);
			p2.addNode(2);
			boolean equals = p1.equals(p2);
			System.out.println(equals);
		}
}